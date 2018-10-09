import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("The Book", "The Man", "Bookery");
    }

    @Test
    public void inBag() {
        assertEquals(0, borrower.booksInBag());
    }

    @Test
    public void addBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.booksInBag());
    }

    @Test
    public void removeBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.booksInBag());
        borrower.removeBook(book);
        assertEquals(0, borrower.booksInBag());
    }

}
