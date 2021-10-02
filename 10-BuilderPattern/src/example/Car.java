package example;

// concrete builder

public class Car implements IBuilder {
    Product product = new Product();    // a car product with a list of parts

    @Override
    public void createBody() {
        product.add("Car body created");
    }

    @Override
    public void createHeadlight() {
        product.add("2 headlights added");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels inserted");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
