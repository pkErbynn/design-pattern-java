package pk.erbynn;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double totalCost(){
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void processPayment(PaymentStrategy paymentStrategy) {
        int totalAmount = (int) totalCost();
        paymentStrategy.pay(totalAmount);
    }
}
