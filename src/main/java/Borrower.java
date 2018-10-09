import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bag;

    public Borrower() {
        this.bag = new ArrayList<>();
    }

    public int booksInBag() {
        return this.bag.size();
    }
}
