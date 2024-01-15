package labs.lab_13_books_management;

public class Book {

    private String ISBN;
    private String title;
    private String author;
    private String year;

    protected Book(String ISBN, String title, String author, String year) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    protected String getISBN() {
        return ISBN;
    }

    protected void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected String getYear() {
        return year;
    }

    protected void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

}
