package com.pkerbynn.abstractCreator;

interface IShape {
    void draw();
}
class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle...");
    }
}

class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Draw square...");
    }
}

class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Draw circle...");
    }
}