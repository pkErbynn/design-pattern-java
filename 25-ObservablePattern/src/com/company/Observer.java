package com.company;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    // method to update the observer, used by subject
    public void update();

    // attach with subject to observe, not required,
    // but added so that the observer can query the subject to see if an update has occurred
    public void setSubject(Subject subject);
}

class MyTopicSubscriber implements Observer {
    private String name;
    private Subject topic;  // each subscriber has sub to a topic

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (message == null) {
            System.out.println(name + " :: No new message");
        } else {
            System.out.println(name + " :: Consuming message :: " + message);
        }
    }

    // not really required, but added so observer can ask for state
    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}