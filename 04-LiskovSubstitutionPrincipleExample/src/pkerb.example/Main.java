package pkerb.example;

// error prone, design focus

abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle {

    @Override
    int getSpeed() { return 0; }

    @Override
    int getCubicCapacity() { return 0;}

    boolean isHatchBack () {return true;}   // extension
}

class Bus extends Vehicle {

    @Override
    int getSpeed() { return 0; }

    @Override
    int getCubicCapacity() { return 0;}

    String getEmergencyExitLocation () {return "something"; }   // extension
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        ((Car) vehicle).isHatchBack();
        vehicle = new Bus();
        ((Bus) vehicle).getEmergencyExitLocation();
    }
}
