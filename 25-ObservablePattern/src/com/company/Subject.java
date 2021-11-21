package com.company;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    // register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    // method to notify observers for changes
    public void notifyObservers();

    // method to get updates from subject, not required,
    // but added so observers can query for update
    public Object getUpdate(Observer observer);

}

class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean hasChanged;

    public MyTopic(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null)
            throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> localObservers = null;
        if(hasChanged){
            localObservers = new ArrayList<>(this.observers);
            this.hasChanged = false;

            for (Observer observer : localObservers) {
                observer.update();
            }
        }
        return;
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    // method to post message to the topic, change state and trigger notification
    public void postMessage(String message) {
        System.out.println("Message posted to Topic: " + message);
        this.message = message;
        this.hasChanged = true;
        notifyObservers();
    }
}

