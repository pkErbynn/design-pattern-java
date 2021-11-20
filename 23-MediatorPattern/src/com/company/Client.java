package com.company;

// Chat application
// using Mediator to coordinate messages among users

public class Client {

    public static void main(String[] args) {
	// write your code here
        IChatMediator chatMediator = new ChatMediatorImpl();

        User user1 = new UserImpl(chatMediator, "Erb");
        User user2 = new UserImpl(chatMediator, "Kwesi");
        User user3 = new UserImpl(chatMediator, "Bin");
        User user4 = new UserImpl(chatMediator, "Gastone");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hi all");
    }
}
