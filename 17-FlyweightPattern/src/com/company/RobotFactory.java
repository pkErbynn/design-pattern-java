package com.company;

// flyweigth factory

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();   // cache

    public int totalObjectsCreated(){
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotType){
        IRobot robot = null;

        if(shapes.containsKey(robotType)){
            robot = shapes.get(robotType);
        }
        else {
            switch (robotType){
                case "ironman":
                    System.out.println("Small robot not found. Create one.");
                    robot = new Robot("ironman");   // create base robot
                    shapes.put("ironman", robot);
                    break;
                case "transformer":
                    System.out.println("Large robot not found. Create one.");
                    robot = new Robot("transformer");
                    shapes.put("transformer", robot);
                    break;
                default:
                    System.out.println("Fatal error: Robot Factory can only create ironman or transformer robots");
            }
        }

        return robot;
    }
}
