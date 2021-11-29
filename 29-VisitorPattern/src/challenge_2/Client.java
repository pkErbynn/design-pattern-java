package challenge_2;

// online Shopping Cart application that calculate cost of postage for shipping items
// postage cost depends on the weight and location/region of each item
// required to create a separate visitor for each postal region

// implement using the Visitor pattern
// separate the logic of calc the total postage cost from the items themselves
// individual elements do not need to know anything about the postal cost policy
// decouple object structure and the logic element

// major different with the simple example implementation
// 1. return of each item cost to caller vs return of accumulated cost
// 2. one concrete visitor class vs multiple concrete visitor class

import java.util.ArrayList;
import java.util.List;

public class Client {
    static private List<IVisitableItem> items = new ArrayList<IVisitableItem>();

    private static double calculatePostageTotalCost(IShoppingCartVisitor visitor) {

        for (IVisitableItem item : items) {
            item.accept(visitor);
        }
        double postageCost = visitor.getTotalPostageForCart();
        return postageCost;
    }

    public static void main(String[] args) {
        // add items to your cart
        items.add(new Book(15, 3));
        items.add(new Laptop(1500, 25));
        items.add(new Phone(800, 5.6));

        // create west africa visitor, pass it for postage cost calc
        IShoppingCartVisitor shoppingCartVisitor = new WestAfricaShoppingCartVisitor();
        double total = calculatePostageTotalCost(shoppingCartVisitor);
        System.out.println("Total Postage Cost in West Africa = " + total + "ghs");

        // create east africa visitor, pass it to determine postage cost in east africa
        shoppingCartVisitor = new EastAfricaShoppingCartVisitor();
        total = calculatePostageTotalCost(shoppingCartVisitor);
        System.out.println("Total Postage Cost in East Africa = " + total + "ghs");
    }
}
