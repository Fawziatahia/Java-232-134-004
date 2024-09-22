import java.util.ArrayList;
import java.util.Scanner;

public class MyLibrary {
    private ArrayList<String> books;
  public MyLibrary() {
        books = new ArrayList<>();
    }
  
  public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }
  
    public void removeBookByIndex(int index) {
        if (index >= 0 && index < books.size()) {
            String removedBook = books.remove(index);
            System.out.println(removedBook + " removed from the library.");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void removeBookByTitle(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from the library.");
        } else {
            System.out.println("Book not found!");
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

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book by Index");
            System.out.println("3. Remove Book by Title");
            System.out.println("4. Show All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookToAdd = scanner.nextLine();
                    library.addBook(bookToAdd);
                    break;
                case 2:
                    System.out.print("Enter index to remove: ");
                    int index = scanner.nextInt();
                    library.removeBookByIndex(index - 1); // Convert to 0-based index
                    break;
                case 3:
                    System.out.print("Enter book title to remove: ");
                    String bookToRemove = scanner.nextLine();
                    library.removeBookByTitle(bookToRemove);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}