package pk.erbynn;

abstract class OrderProcessTemplate {
    public boolean isGift;  // whether item is a gift or not

    public abstract void doSelect(); // select items to buy
    public abstract void doPayment();

    public final void giftWrap() {   // no override by subclasss
        System.out.println("Gift wrapped successfully");
    }

    public abstract void doDelivery();

    // actual template method...not overridable
    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();

        if (isGift) {
            giftWrap();
        }

        doDelivery();
    }

    // or simply (without the logic)
//    public final void processOrder(boolean isGift) {
//        doSelect();
//        doPayment();
//        giftWrap();
//        doDelivery();
//    }
}

class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get git wrap preference");
        System.out.println("Get delivery address");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment through Netbanking, card or paypal");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship items to given address");
    }
}


class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Customer chooses items on shelf.");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment at the counter through cash");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item to the delivery counter");
    }
}
