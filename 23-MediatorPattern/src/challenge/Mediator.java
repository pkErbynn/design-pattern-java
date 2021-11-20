package challenge;

import java.util.ArrayList;

interface Mediator {
    public void addBuyer(Buyer buyer);
    public void findHighestBidder();
}

class ActionMediator implements Mediator {
    // hold buyers
    // can add buyers and fine the highest bidder
    private ArrayList<Buyer> buyers;

    public ActionMediator() {
        this.buyers = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        this.buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer b : this.buyers) {
            if (b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
            b.auctionHasEnded();
        }

        System.out.println("The auction winner is " + winner.name + ". He paid " + winner.price + " $ for the item");
    }

}

// mediator holds the buyers to communicate with and each buyer has the mediator too
