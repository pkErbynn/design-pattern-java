package challenge;

// auction simulation

public class Client {
    public static void main(String[] args) {
        ActionMediator mediator = new ActionMediator();

        Buyer buyer1 = new AuctionBuyer(mediator, "Selase");
        Buyer buyer2 = new AuctionBuyer(mediator, "Deladem");
        Buyer buyer3 = new AuctionBuyer(mediator, "Anthony");

        // create and add buyers
        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Volks");
        System.out.println("----------------------");

        System.out.println("Waiting for the buyers' offers");

        buyer1.bid(1500);
        buyer2.bid(2000);
        buyer3.bid(1800);

        System.out.println("----------------------");
        mediator.findHighestBidder();

        buyer2.cancelTheBid();
        System.out.println(buyer2.name + " has canceled their bid, in that case, ");

        mediator.findHighestBidder();
    }

}


