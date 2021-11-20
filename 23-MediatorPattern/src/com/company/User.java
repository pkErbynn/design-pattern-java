package com.company;

public abstract class User {
    protected IChatMediator mediator;   // every user is plugged with the mediator to communicate with the mediator
    protected String name;

    public User(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}

class UserImpl extends User {
    public UserImpl(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    // uses the mediator to send the entire OBJECT as message
    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message = " + msg);
        mediator.sendMessage(msg, this);
    }

    // receiving messages sent
    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Receive Message = " + msg);
    }

}


