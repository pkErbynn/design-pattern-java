package pk.erbynn;

public class Item {
    private String upcCode;
    private double price;

    public Item(String upcCode, double price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public double getPrice() {
        return price;
    }
}
