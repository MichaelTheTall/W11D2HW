import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Book", "The Man", "Bookery");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Book", book.title());
    }

    @Test
    public void hasAuthor() {
        assertEquals("The Man", book.author());
    }

    @Test
    public void hasGenre() {
        assertEquals("Bookery", book.genre());
    }

}
