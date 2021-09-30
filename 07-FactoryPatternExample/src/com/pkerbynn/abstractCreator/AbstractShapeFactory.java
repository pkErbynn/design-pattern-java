package com.pkerbynn.abstractCreator;

public abstract class AbstractShapeFactory {
    protected abstract IShape factoryMethod();
    public IShape getShape(){
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory {
    public IShape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {
    public IShape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {
    public IShape factoryMethod() {
        return new Circle();
    }
}