import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
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
}
