package com.company;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Rectangle with normal border");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Circle with normal border");
    }
}