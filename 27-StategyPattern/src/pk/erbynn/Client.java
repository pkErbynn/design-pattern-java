package pk.erbynn;

public class Client {

    public static void main(String[] args) {
	    ShoppingCart shoppingCart = new ShoppingCart();

        Item shortbread = new Item("3453", 32.99);
        Item microwave = new Item("A234", 420.00);
        Item exerterCornedBeef = new Item("A234", 16.99);

        shoppingCart.addItem(shortbread);
        shoppingCart.addItem(microwave);
        shoppingCart.addItem(exerterCornedBeef);

        // pay with credit/debit card
        shoppingCart.processPayment(new CreditCartStrategy("AG43-12GTE-5433", "7041", "10/20/24"));

        // pay with paypal
        shoppingCart.processPayment(new PayPalStrategy("john.erbynn@gmail.com", "@passw3d"));

    }
}
