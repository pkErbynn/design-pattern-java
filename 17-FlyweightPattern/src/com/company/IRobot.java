package com.company;

interface IRobot {
    void print();

    // extrinsic data passed as argument...this data changes
    void setColor(String color);
}

class Robot implements IRobot{
    String type;
    String color;

    public Robot(String type) {
        this.type = type;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Robot = Type: " + this.type + ", Color: " + this.color);
    }
}