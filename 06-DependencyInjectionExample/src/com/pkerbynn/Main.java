package com.pkerbynn;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Client {
    private Service service;

    public Client(){
        service = new Service();
    }

    public void greetOut(){
        service.greet();
    }
}

class Service {

    public void greet(){
        System.out.println("Greet");
    }
}
