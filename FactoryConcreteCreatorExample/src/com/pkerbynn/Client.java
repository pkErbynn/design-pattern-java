package com.pkerbynn;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShape("Circle").draw();
        shapeFactory.createShape("Rectangle").draw();
        shapeFactory.createShape("Square").draw();

        IShape shape1 = shapeFactory.createShape("Rectangle");
        shape1.draw();
    }
}
