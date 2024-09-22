import java.util.ArrayList;
import java.util.Scanner;

public class MyLibrary {
    private ArrayList<String> books;

    public MyLibrary() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " has been added to the library.");
    }

    public void removeBookByIndex(int index) {
        if (index >= 0 && index < books.size()) {
            String removedBook = books.remove(index);
            System.out.println("Book \"" + removedBook + "\" has been removed from the library.");
        } else {
            System.out.println("Invalid index! Please enter a valid index.");
        }
    }

    public void removeBookByTitle(String book) {
        if (books.remove(book)) {
            System.out.println("Book \"" + book + "\" has been removed from the library.");
        } else {
            System.out.println("Book not found! Please enter a valid title.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Operations Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book by index");
            System.out.println("3. Remove a book by title");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to add: ");
                    String bookToAdd = scanner.nextLine();
                    addBook(bookToAdd);
                    break;
                case 2:
                    System.out.print("Enter the index of the book to remove: ");
                    int indexToRemove = scanner.nextInt();
                    removeBookByIndex(indexToRemove - 1); // Subtract 1 to convert to 0-based index
                    break;
                case 3:
                    System.out.print("Enter the title of the book to remove: ");
                    String bookToRemove = scanner.nextLine();
                    removeBookByTitle(bookToRemove);
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose an option between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();
        library.userMenu(); 
    }
}