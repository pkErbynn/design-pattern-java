package com.company;

import java.util.ArrayList;
import java.util.List;

interface IChatMediator {   // interface will be part of each users....ie, user interface
    void sendMessage(String msg, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements IChatMediator {
    private List<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            // message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}
