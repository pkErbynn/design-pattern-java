package com.company;

// abstract wrapper
abstract class ShapeDecorator implements Shape{   // implement shape and has shape as composition as well
    protected Shape shapeToDecorate;

    public ShapeDecorator(Shape shapeToDecorate) {
        this.shapeToDecorate = shapeToDecorate;
    }

    public void draw() {
        shapeToDecorate.draw();
    }
}

// concrete wrapper
class RedBorderShapeDecorator extends ShapeDecorator {
    public RedBorderShapeDecorator(Shape shape) {
        super(shape);
    }

    // wrapper to extend the draw functionality, with border method
    public void draw(){
        this.shapeToDecorate.draw();
        setRedBorder(shapeToDecorate);
    }

    private void setRedBorder(Shape shapeToDecorate){
        System.out.println("Set border to Red");
    }
}

