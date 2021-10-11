package objectCompositionExample_2;

// adopt methods with diff signature

public class Client {
    public static void main(String[] args) {
        System.out.println("===== Adaptor Pattern Demo =====");

        Triangle triangle = new Triangle(20, 10);
        CalculatorAdaptor calculatorAdaptor = new CalculatorAdaptor(triangle);

        System.out.println(" Area of Triangle is: " + calculatorAdaptor.getArea(null)); // null arg
    }
}
