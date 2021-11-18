package com.company;

public class IssueRaiser {
    private IReceiver firstReceiver;

    // first handler is set as param
    public IssueRaiser(IReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message) {
        // first handler processes the message
        if (firstReceiver != null) {
            firstReceiver.processMessage(message);
        }
    }
}
