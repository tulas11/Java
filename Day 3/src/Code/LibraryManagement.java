//create Library management application with following menu
// Menu 1:Show All Books
// Menu 2:Add New Book
// Menu 3:Update Book
// Menu 4:Delete Book
// Menu 5:edit name 
// Menu 6:edit Author
// Menu 7:edit price
// Menu 8:get book details by book_id
// Menu 9:Show All Books price >450
// Menu 1:Show All Books names only
package Code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book {
    int bookId;
    String name;
    String author;
    double price;

    public Book(int bookId, String name, String author, double price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }
}

public class LibraryManagement {
    // ArrayList to store the library books
    static ArrayList<Book> library = new ArrayList<>();
    // Scanner for user input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // Display the menu options
            displayMenu();
            // Get user choice
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            // Switch based on user choice
            switch (choice) {
                case 1:
                    showAllBooks();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    editName();
                    break;
                case 6:
                    editAuthor();
                    break;
                case 7:
                    editPrice();
                    break;
                case 8:
                    getBookDetailsById();
                    break;
                case 9:
                    showBooksAbovePrice();
                    break;
                case 10:
                    showAllBooks();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Display the menu options
    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1: Show All Books");
        System.out.println("2: Add New Book");
        System.out.println("3: Update Book");
        System.out.println("4: Delete Book");
        System.out.println("5: Edit Name");
        System.out.println("6: Edit Author");
        System.out.println("7: Edit Price");
        System.out.println("8: Get Book Details by BookId");
        System.out.println("9: Show All Books with Price > 450");
        System.out.println("10: Show All Book Names Only");
        System.out.println("0: Exit");
        System.out.print("Enter your choice: ");
    }

    // Display all books in the library
    private static void showAllBooks() {
        System.out.println("All Books in the Library:");
        for (Book book : library) {
            System.out.println(book.bookId + ": " + book.name + " by " + book.author + " - $" + book.price);
        }
    }

    // Add a new book to the library
    private static void addNewBook() {
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Book newBook = new Book(bookId, name, author, price);
        library.add(newBook);
        System.out.println("Book added successfully!");
    }

    // Update information of an existing book
    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (Book book : library) {
            if (book.bookId == bookId) {
                System.out.print("Enter new Book Name: ");
                String name = sc.nextLine();
                System.out.print("Enter new Author Name: ");
                String author = sc.nextLine();
                System.out.print("Enter new Price: ");
                double price = sc.nextDouble();

                book.name = name;
                book.author = author;
                book.price = price;
                System.out.println("Book updated successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Delete a book from the library
    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int bookId = sc.nextInt();

        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.bookId == bookId) {
                iterator.remove();
                System.out.println("Book deleted successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Edit the name of a book
    private static void editName() {
        System.out.print("Enter Book ID to edit name: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (Book book : library) {
            if (book.bookId == bookId) {
                System.out.print("Enter new Book Name: ");
                String name = sc.nextLine();
                book.name = name;
                System.out.println("Name updated successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Edit the author of a book
    private static void editAuthor() {
        System.out.print("Enter Book ID to edit author: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (Book book : library) {
            if (book.bookId == bookId) {
                System.out.print("Enter new Author Name: ");
                String author = sc.nextLine();
                book.author = author;
                System.out.println("Author updated successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Edit the price of a book
    private static void editPrice() {
        System.out.print("Enter Book ID to edit price: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (Book book : library) {
            if (book.bookId == bookId) {
                System.out.print("Enter new Price: ");
                double price = sc.nextDouble();
                book.price = price;
                System.out.println("Price updated successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Get details of a book by its ID
    private static void getBookDetailsById() {
        System.out.print("Enter Book ID to get details: ");
        int bookId = sc.nextInt();

        for (Book book : library) {
            if (book.bookId == bookId) {
                System.out.println("Book details:");
                System.out.println("Book ID: " + book.bookId);
                System.out.println("Name: " + book.name);
                System.out.println("Author: " + book.author);
                System.out.println("Price: $" + book.price);
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Show books with a price above $450
    private static void showBooksAbovePrice() {
        System.out.println();
    }
}
