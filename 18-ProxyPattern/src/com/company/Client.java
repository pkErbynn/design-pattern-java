package com.company;

public class Client {

    public static void main(String[] args) {
        IInternet internet = new ProxyInternet();

        try {
            internet.connectTo("goal.com");
            internet.connectTo("whatever.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//nb: client does not interact with the real class