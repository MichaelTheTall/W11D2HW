import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        library = new Library(10);
        book1 = new Book("The Book", "The Man", "Bookery");
        book2 = new Book("The Book 2: Electric Boogaloo", "Mr. The Man", "Bookery");
        book3 = new Book("The Book 3: Books at Sea", "Sir The Man", "Bookery");
    }

    @Test
    public void maxCapacity() {
        assertEquals(10, library.maxCapacity());
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        assertEquals(9, library.capacity());
        assertEquals(1, library.totalOfBooks());
    }

    @Test
    public void bookTotal() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.totalOfBooks());
    }

    @Test
    public void tooManyBooks() {
        Library templib = new Library(2);
        assertEquals("", templib.checkSpace(book1));
        assertEquals("", templib.checkSpace(book2));
        assertEquals(2, templib.totalOfBooks());
        assertEquals("The Library is Full!", templib.checkSpace(book3));
    }
}
