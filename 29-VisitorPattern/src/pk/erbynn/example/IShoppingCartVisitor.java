package pk.erbynn.example;

// purpose: to declare the visit operations for all the types of booked classes
// determines the concrete class responsible for each visitor's(item class) request

interface IShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

// operation class implement a fragment of the algorithm
// provides context, stores its local state, and the state often accumulate as it goes through the list

class ShoppingCartImpl implements IShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5; // 5ghs discount if more than 50
        } else {
            cost = book.getPrice();
        }

        System.out.println("Book ISBN: " + book.getIsbnNumber() + ", costs: " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();

        System.out.println("Fruit: " + fruit.getName() + ", cost: " + cost);
        return cost;
    }
}