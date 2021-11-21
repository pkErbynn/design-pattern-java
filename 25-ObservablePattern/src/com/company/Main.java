package com.company;

// creating a topic that observers can get updated info when topic message changes

public class Main {

    public static void main(String[] args) {
	 // create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer observer1 = new MyTopicSubscriber("obs 1");
        Observer observer2 = new MyTopicSubscriber("obs 2");
        Observer observer3 = new MyTopicSubscriber("obs 3");

        // register observers to the subject/topic
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        // attach observer to subject (not required)
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        // check if update is available, not required
        observer1.update();

        // now, send message to subject to trigger notification
        topic.postMessage("New message");
    }
}
