package co3;

// Parent class
class LibraryItem {

    // Public member
    public String title;

    // Protected member
    protected String author;

    // Private member
    private double price;

    // Constructor
    LibraryItem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter for private price
    public double getPrice() {
        return price;
    }
}

// Child class
class Book extends LibraryItem {

    String publisher;
    int edition;

    // Constructor
    Book(String title, String author, double price,
         String publisher, int edition) {

        super(title, author, price);

        this.publisher = publisher;
        this.edition = edition;
    }

    // Display complete book information
    void displayBook() {

        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Publisher : " + publisher);
        System.out.println("Edition : " + edition);

        // Access private price through getter
        System.out.println("Price : " + getPrice());
    }
}

// Main class
public class LibraryBook {

    public static void main(String[] args) {

        Book book = new Book(
                "Java Programming",
                "Herbert Schildt",
                650.0,
                "McGraw Hill",
                12
        );

        book.displayBook();
    }
}
