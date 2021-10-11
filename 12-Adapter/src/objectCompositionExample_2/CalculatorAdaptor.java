package objectCompositionExample_2;

public class CalculatorAdaptor implements ICalculator{ // ICalculator = target
    // source name matches the adaptor name
    // concrete class modifying it's getArea(Rectangle) interface api to adapt to a getArea(Triangle), ie. diff method signature
    Calculator calculator;

    // the resource (ie. parameter) it will need to adapt
    // ...becomes the DI
    Triangle triangle;

    CalculatorAdaptor(Triangle triangle){
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rect) {    // Parameter will not be set by the client caller since will be created internally
        calculator = new Calculator();  // not in DI

        Rectangle rectangle = new Rectangle();  // since param will be null by client

        // converting triangle attributes to rectangle's
        rectangle.length = this.triangle.base;
        rectangle.width = 0.5 * this.triangle.height;

        return calculator.getArea(rectangle);

        // all object for conversion / computation is done internally except the adopter's resource
    }
}
