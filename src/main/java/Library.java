import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String,Integer> genreHash;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
        this.genreHash = new HashMap<>();
    }

    public Object genreList() {
        return this.genreHash;
    }

    public int maxCapacity() {
        return this.capacity;
    }

    public int totalOfBooks() {
        return stock.size();
    }

    public int capacity() {
        return this.capacity - totalOfBooks();
    }

    public void addBook(Book book) {
        stock.add(book);
        Integer count = genreHash.get(book.genre());
        if (count == null) {
            genreHash.put(book.genre(), 1);
        } else {
            genreHash.put(book.genre(), count + 1);
        }
    }

    public void removeBook(Book book) {
        stock.remove(book);
        Integer count = genreHash.get(book.genre());
        genreHash.put(book.genre(), count - 1);
    }

    public String full() {
        return "The Library is Full!";
    }

    public String checkSpace(Book book) {
        if (totalOfBooks() < maxCapacity()) {
            addBook(book);
            return "";
        } else {
            return full();
        }
    }

    public void signOut(Book book, Borrower borrower) {
        removeBook(book);
        borrower.addBook(book);
    }

    public void returns(Book book, Borrower borrower) {
        borrower.removeBook(book);
        addBook(book);
    }
}
