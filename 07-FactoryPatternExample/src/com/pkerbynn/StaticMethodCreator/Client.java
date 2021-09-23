package com.pkerbynn.StaticMethodCreator;

public class Client {

    public static void main(String[] args) {
        IShape shape1 = ShapeFactory.getShape("Rectangle");
        shape1.draw();

        IShape shape2 = ShapeFactory.getShape("Square");
        shape2.draw();

        IShape shape3 = ShapeFactory.getShape("Rectangle");
        shape3.draw();

    }
}
