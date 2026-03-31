
import java.util.*;
import java.util.stream.*;

class Book {
    private String genre;
    private int pages;

    public Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 500),
            new Book("Science", 400)
        );

        Map<String, IntSummaryStatistics> stats =
            books.stream()
                .collect(Collectors.groupingBy(
                    Book::getGenre,
                    Collectors.summarizingInt(Book::getPages)
                ));

        stats.forEach((genre, data) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + data.getSum());
            System.out.println("Average Pages: " + data.getAverage());
            System.out.println("Max Pages: " + data.getMax());
            System.out.println("--------------------");
        });
    }
}
