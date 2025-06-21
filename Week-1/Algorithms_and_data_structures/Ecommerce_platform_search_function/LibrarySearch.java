import java.util.*;

public class LibrarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = Arrays.asList(
            new Book(101, "The Alchemist", "Fiction", 208),
            new Book(102, "Sapiens", "History", 498),
            new Book(103, "1984", "Fiction", 328),
            new Book(104, "To Kill a Mockingbird", "Fiction", 324),
            new Book(105, "Educated", "Memoir", 334),
            new Book(106, "Brief Answers to the Big Questions", "Science", 256),
            new Book(107, "The Great Gatsby", "Fiction", 218)
        );

        System.out.print("Enter genre to search: ");
        String genre = scanner.nextLine();

        System.out.print("Enter minimum pages: ");
        int minPages = scanner.nextInt();

        System.out.print("Enter maximum pages: ");
        int maxPages = scanner.nextInt();

        System.out.println("\nSearch Results:");
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre) &&
                book.getPages() >= minPages &&
                book.getPages() <= maxPages) {
                System.out.println(book);
            }
        }
    }
}
