public class Book {
    private int id;
    private String title;
    private String genre;
    private int pages;

    public Book(int id, String title, String genre, int pages) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{ID=" + id + ", Title='" + title + "', Genre='" + genre + "', Pages=" + pages + "}";
    }
}
