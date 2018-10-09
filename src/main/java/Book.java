public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String title() {
        return this.title;
    }

    public String author() {
        return this.author;
    }

    public String genre() {
        return this.genre;
    }
}
