package com.pkerbynn.abstractCreator;

public class Client {
    public static void main(String[] args) {
        IShape shape1 = new CircleFactory().getShape();
        shape1.draw();
    }
}
