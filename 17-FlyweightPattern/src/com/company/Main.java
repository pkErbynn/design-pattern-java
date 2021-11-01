package com.company;

// concept of flyweight with Robots sharing extrinsic data

public class Main {

    public static void main(String[] args) {

        RobotFactory myFactory = new RobotFactory();
        System.out.println("Flyweight Pattern");

        IRobot shape = null;

        // getting 2 additional robot...no need to create a one since already created in cache
        System.out.println();
        for (int i = 0; i < 3; i++) {
            shape = myFactory.getRobotFromFactory("ironman");
            shape.setColor("red");
            shape.print();
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            shape = myFactory.getRobotFromFactory("transformer");
            shape.setColor("blue");
            shape.print();
        }

        int numberOfRobots = myFactory.totalObjectsCreated();
        System.out.println("\nTotal objects created till now: " + numberOfRobots);
    }
}
