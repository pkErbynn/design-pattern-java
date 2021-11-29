package challenge_2;

// each item is collected into the Visitor class
// for store its price
// no return type for 'accept'
interface IVisitableItem {
    public void accept(IShoppingCartVisitor visitor);
}

class Book implements IVisitableItem {
    private double price;
    private double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(IShoppingCartVisitor visitor) {
        visitor.visit(this); // each item visits the Visitor class to for calc
    }
}

class Laptop implements IVisitableItem {
    private double price;
    private double weight;

    public Laptop(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(IShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}

class Phone implements IVisitableItem {
    private double price;
    private double weight;

    public Phone(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(IShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}