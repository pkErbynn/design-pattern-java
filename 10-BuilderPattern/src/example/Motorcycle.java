package example;

// concrete builder

public class Motorcycle implements IBuilder {
    Product product = new Product();    // a motor product with a list of parts

    @Override
    public void createBody() {
        product.add("Motor body created");
    }

    @Override
    public void createHeadlight() {
        product.add("1 headlight added");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels inserted");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
