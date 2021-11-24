package pk.erbynn;

interface PaymentStrategy {
    public void pay(int amount);    // depending on the algo to be used to make the payment
}

class CreditCartStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCartStrategy(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "$ with Credit Card");
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "$ with PayPal");
    }
}