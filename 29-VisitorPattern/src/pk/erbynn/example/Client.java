package pk.erbynn.example;

// Domain: Simulation of online Shopping Cart where items will be picked
// and the total cost of the items will be calculated
// and done using the Visitor pattern - where logic for cost calculation is moved to another class
// making it loosely coupled

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<IItem> items = new ArrayList<IItem>();

        items.add(new Book("123", 10));
        items.add(new Book("45667", 40));
        items.add(new Book("123", 60));
        items.add(new Fruit(6, 5, "Water melon"));
        items.add(new Fruit(2, 2, "Apple"));
        items.add(new Fruit(3, 3, "Banana"));

        int total = calculateTotalCost(items);

        System.out.println("Total Cost: " + total + "ghs");
    }

    private static int calculateTotalCost(List<IItem> items) {
        // create visitor, pass it to each element, calc price, then return result for each
        IShoppingCartVisitor shoppingCartVisitor = new ShoppingCartImpl();

        int sum = 0;
        for (IItem item : items) {
            sum += item.accept(shoppingCartVisitor);
        }

        return sum;
    }
}

// #30 - #37: added functionality to the collection (through each element) without affecting the collection