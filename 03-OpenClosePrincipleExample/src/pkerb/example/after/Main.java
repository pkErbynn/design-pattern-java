package pkerb.example.after;

//===== After
class Main {
}

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape{
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7) * this.radius * this.radius;
    }
}

class AreaCalculator {
    public double calculateRectangleArea(Shape shape){
        return shape.calculateArea();
    }
}

// introduces Interface as mediator (concrete class >> interface >> consumer)
// #31 caller, AreaCalculator, uses only one generic implementation for all shapes
// closed for modification, #31, open for modification (introduction of interface)