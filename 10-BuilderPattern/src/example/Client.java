package example;

// App that creates a vehicle...either car or motorcycle
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        IBuilder car = new Car();
        IBuilder motor = new Motorcycle();

        director.Construct(car);
        Product prod = car.getProduct();
        prod.showItsParts();

        director.Construct(motor);
        prod = motor.getProduct();
        prod.showItsParts();
    }
}
