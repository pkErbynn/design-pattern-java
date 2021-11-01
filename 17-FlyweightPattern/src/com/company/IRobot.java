package com.company;

interface IRobot {
    void print();

    // extrinsic data passed as argument...this data changes
    // used by client to change data and it's not shared
    void setColor(String color);
}

class Robot implements IRobot{
    String type;
    String color;

    // intrinsic state stored in concrete object
    // does not change thus it's shared
    public Robot(String type) {
        this.type = type;
    }

    // extrinsic unshared data set by client
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Robot = Type: " + this.type + ", Color: " + this.color);
    }
}

//nb: identify intrinsic and extrinsic data