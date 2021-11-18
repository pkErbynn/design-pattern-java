package com.company;

// Error handler program using the chain of responsibility
// to take care of issues reported in each communication
// raise error and forward the error to be handled

public class Client {

    public static void main(String[] args) {
	// write your code here
        System.out.println("=== Chain of Responsibility Pattern Demo ===");

        IReceiver faxHandler,
                emailHandler,
                unknownHandler;

        // creating the chain
        unknownHandler = new UnknownErrorHandler(); // third and last handler

        emailHandler = new EmailErrorHandler(); // second handler
        emailHandler.setNextChain(unknownHandler);  // set third and last handler

        faxHandler = new FaxErrorHandler(); // first handler
        faxHandler.setNextChain(emailHandler);  // set second handler

        // issuing a raise
        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);  // first handler passed to handle

        Message message1 = new Message("Fax reaching late to destination", MessagePriority.High);
        Message message2 = new Message("Email is not sent", MessagePriority.High);
        Message message3 = new Message("In the Email, BCC field is disabled", MessagePriority.Normal);
        Message message4 = new Message("Fax is down", MessagePriority.High);
        Message message5 = new Message("Something went wrong", MessagePriority.High);

        issueRaiser.raiseMessage(message1);
        issueRaiser.raiseMessage(message2);
        issueRaiser.raiseMessage(message3);
        issueRaiser.raiseMessage(message4);
        issueRaiser.raiseMessage(message5);
    }
}
