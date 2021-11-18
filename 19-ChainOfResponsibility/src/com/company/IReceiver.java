package com.company;

public interface IReceiver {
    boolean processMessage(Message message);

    void setNextChain(IReceiver nextChain);
}


class FaxErrorHandler implements IReceiver {
    private IReceiver nextReceiver; // reference to the next object in chain to forward the request to

    // fax, first handler set by the client, processes the message
    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.priority + " priority issue: " + message.text);
            return true;
        } else {
            // passing to the next handler...next handler is not set as constructor param #29
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
        this.nextReceiver = nextChain;
    }
}


class EmailErrorHandler implements IReceiver {
    private IReceiver nextReceiver; // since not first handler, it's set by setter method

    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.priority + " priority issue: " + message.text);
            return true;
        }else {
            if (nextReceiver != null) {
                // set and passed to next handler
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
        this.nextReceiver = nextChain;
    }
}


class UnknownErrorHandler implements IReceiver {

    @Override
    public boolean processMessage(Message message) {
        System.out.println("UnknownErrorHandler processed issue " + message.text);
        return true;
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
//        not need to set since it's the last handler
    }
}