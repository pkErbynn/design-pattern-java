package com.company;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // normal shape
        circle.draw();
        rectangle.draw();

        // decorated shape
        Shape redCircle = new RedBorderShapeDecorator(new Circle());
        Shape redRectangle = new RedBorderShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
