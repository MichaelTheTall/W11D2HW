import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bag;

    public Borrower() {
        this.bag = new ArrayList<>();
    }

    public int booksInBag() {
        return this.bag.size();
    }

    public void addBook(Book book) {
        this.bag.add(book);
    }

    public Book removeBook(Book book) {
        int index = this.bag.indexOf(book);
        return this.bag.remove(index);
    }
}
