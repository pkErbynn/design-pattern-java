package challenge_2;

// purpose: to declare the visit operations for all the types of booked classes
// determines the concrete class responsible for each visitor's(item class) request

interface IShoppingCartVisitor {
    void visit(Book book);
    void visit(Laptop laptop);
    void visit(Phone phone);
    double getTotalPostageForCart();
}

// stores local state, accumulate and return

class WestAfricaShoppingCartVisitor implements IShoppingCartVisitor {
    private double totalPostageCostForCart = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() <= 50.0) {
            totalPostageCostForCart += book.getWeight() * 2;
        }
        // free postage for books over 50
    }

    @Override
    public void visit(Laptop laptop) {
        totalPostageCostForCart += laptop.getWeight() * 8;
    }

    @Override
    public void visit(Phone phone) {
        if (phone.getPrice() >= 10.0) {
            totalPostageCostForCart += phone.getWeight() * 4.5;
        }
    }

    // return accumulated internal state
    public double getTotalPostageForCart(){
        return this.totalPostageCostForCart;
    }
}

class EastAfricaShoppingCartVisitor implements IShoppingCartVisitor {
    private double totalPostageCostForCart = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() <= 60.0) {
            totalPostageCostForCart += (book.getWeight() * 2) * 2;  // doubled weight by price
        }
        // free postage for books over 60
    }

    @Override
    public void visit(Laptop laptop) {
        totalPostageCostForCart += (laptop.getWeight() * 2) * 8;
    }

    @Override
    public void visit(Phone phone) {
        if (phone.getPrice() >= 10.0) {
            totalPostageCostForCart += (phone.getWeight() * 1.5) * 4.5;
        }
    }

    // return accumulated internal state
    public double getTotalPostageForCart(){
        return this.totalPostageCostForCart;
    }
}