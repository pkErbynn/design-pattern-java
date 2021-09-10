package pkerb.example;

//===== Before

class Rectangle {
    public double length;
    public double width;
}

class Circle {
    public double radius;
}

class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }
    public double calculateCircleArea(Circle circle){
        return (22/7) * circle.radius * circle.radius;
    }
//    Problem: as class grows, area calculator (caller) also grows
}


