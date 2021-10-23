package com.company;

//the bridge...with composition relationship with the implementation abstraction
//in a rest of the patterns, this wouldn't be another abstraction layer
abstract class Vehicle {
    // key: implementation means - what the abstract class can use
    Workshop workshop1;
    Workshop workshop2;

    Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract public void manufacture();
}

// Refined abstraction (specialization / concrete)
class Car extends Vehicle {
    Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture(){
        System.out.println("Manufacturing Car");
        this.workshop1.work();
        this.workshop2.work();  // Assembly, as second arg passed by client
    }
}

// Refined abstraction
class Bike extends Vehicle {
    Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture(){
        System.out.println("Manufacturing Bike");
        this.workshop1.work();
        this.workshop2.work();
    }
}
