public class Lot {
    private int lotNumber;
    private String description;
    private Bid highestBid;

    public Lot(int lotNumber, String description) {
        this.lotNumber = lotNumber;
        this.description = description;
        this.highestBid = null;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public String getDescription() {
        return description;
    }

    public boolean bidFor(Bid bid) {
        if (highestBid == null || bid.getAmount() > highestBid.getAmount()) {
            highestBid = bid;
            return true;
        } else {
            return false;
        }
    }

    public Bid getHighestBid() {
        return highestBid;
    }
}
