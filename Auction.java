import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots;

    public Auction() {
        lots = new ArrayList<>();
    }

    public void enterLot(int lotNumber, String description) {
        lots.add(new Lot(lotNumber, description));
    }

    public void showLots() {
        for (Lot lot : lots) {
            System.out.println("Lot Number: " + lot.getLotNumber() + " - " + lot.getDescription());
            Bid highestBid = lot.getHighestBid();
            if (highestBid != null) {
                System.out.println("  Highest Bid: " + highestBid.getAmount() + " by " + highestBid.getBidder().getName());
            } else {
                System.out.println("  No bids yet.");
            }
        }
    }

    public void makeABid(int lotNumber, Person bidder, double bidAmount) {
        Lot selectedLot = findLot(lotNumber);
        if (selectedLot != null) {
            boolean success = selectedLot.bidFor(new Bid(bidder, bidAmount));
            if (success) {
                System.out.println("Bid successful for Lot " + lotNumber + " by " + bidder.getName() + " with amount " + bidAmount);
            } else {
                System.out.println("Bid too low for Lot " + lotNumber + ".");
            }
        } else {
            System.out.println("Lot number " + lotNumber + " not found.");
        }
    }

    private Lot findLot(int lotNumber) {
        for (Lot lot : lots) {
            if (lot.getLotNumber() == lotNumber) {
                return lot;
            }
        }
        return null;
    }
}
