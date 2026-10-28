package library;

// Book class belongs to the library package
public class Book {

    // Variables to store book details
    int bookId;
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    public Book(int bookId, String title, String author, double price) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    public void displayBook() {

        System.out.println("Book Details");
        System.out.println("----------------------");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}