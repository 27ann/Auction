public class Main {
    public static void main(String[] args) {
        // Membuat Auction
        Auction auction = new Auction();

        // Menambahkan Lot
        auction.enterLot(1, "Antique Vase");
        auction.enterLot(2, "Van Gogh Painting");

        // Membuat Person
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        // Menampilkan Lot
        auction.showLots();

        // Membuat Bid
        auction.makeABid(1, alice, 1000.0);  // Alice bid untuk lot 1
        auction.makeABid(1, bob, 1500.0);    // Bob bid lebih tinggi untuk lot 1

        // Bob bid untuk lot 2
        auction.makeABid(2, bob, 2000.0);

        // Menampilkan Lot setelah bid
        auction.showLots();
    }
}
