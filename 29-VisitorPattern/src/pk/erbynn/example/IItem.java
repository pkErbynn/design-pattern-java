package pk.erbynn.example;

// each item accept a visit from the Visitor class
// 'int' as return type because, price of each item will be calculated
interface IItem {
    public int accept(IShoppingCartVisitor visitor);
}

class Book implements IItem {
    private String isbnNumber;
    private int price;

    public Book(String isbnNumber, int price) {
        this.isbnNumber = isbnNumber;
        this.price = price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this); // each item visits the Visitor class to be calculatored
    }
}

class Fruit implements IItem {
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    // will have diff visit method for diff types of items in the visitor interface
    // that is impl by concrete visitor classes
    @Override
    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}