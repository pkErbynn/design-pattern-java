package objectCompositionExample_2;

public interface ICalculator {
    public double getArea(Rectangle rectangle);
}

class Calculator implements ICalculator{

    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
//    Now, how can this Calculator's getArea methods calculate that of a Triangle
//    since it takes only a Rectangle object
//    needs to adopt to calculating Triangle
}
