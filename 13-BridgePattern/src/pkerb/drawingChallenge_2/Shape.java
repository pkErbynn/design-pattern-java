package pkerb.drawingChallenge_2;

// bridge abstraction class - what the client interacts with
public abstract class Shape {
    IColor color;

    Shape(IColor color) {
        this.color = color;
    }

    public abstract void drawShapes(int border);
    public abstract void modifyBorders(int border, int increment);
}

class Rectangle extends Shape {

    Rectangle(IColor color) {
        super(color);
    }

    // implementer-specific method
    @Override
    public void drawShapes(int border) {
        this.color.fillWithColor(border);
    }

    // abstraction-specific method
    @Override
    public void modifyBorders(int border, int increment) {
        System.out.println("Now, modifying the border width by " + increment + " times");
        int newBorder = border * increment;
        this.drawShapes(newBorder); // update border an redraw
    }
}

class Triangle extends Shape {

    Triangle(IColor color) {
        super(color);
    }

    // implementer-specific method
    @Override
    public void drawShapes(int border) {
        this.color.fillWithColor(10);
    }

    // abstraction-specific method
    @Override
    public void modifyBorders(int border, int increment) {
        System.out.println("Now, modifying the border width by " + increment + " times");
        int newBorder = border * increment;
        this.drawShapes(newBorder); // update border an redraw
    }
}