/*
 * Assignment No: 9
 * Program 2: Library Book Management using final Keyword
 *
 * Aim:
 * To demonstrate the use of final keyword
 * with variables.
 */

// LibraryBook class
class LibraryBook {

    // final variable
    final String ISBN;

    // Other book details
    String title;
    String author;
    double price;

    // Parameterized constructor
    LibraryBook(String ISBN, String title, String author, double price) {

        // Initialize final variable
        this.ISBN = ISBN;

        // Initialize other variables
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void displayBookDetails() {

        System.out.println("------ Library Book Details ------");
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }

    /*
     * The following code is invalid because
     * ISBN is declared final.
     */

    /*
    void changeISBN() {
        ISBN = "9780000000"; // ERROR
    }
    */
}

// Main class
public class LibraryBookDemo {

    public static void main(String[] args) {

        // Create LibraryBook object
        LibraryBook book = new LibraryBook(
                "978-81-123456-7-8",
                "Programming with Java",
                "James Gosling",
                699.00
        );

        // Display book information
        book.displayBookDetails();
    }
}