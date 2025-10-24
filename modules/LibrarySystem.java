
import java.util.Stack;

public class LibrarySystem {
    private Stack<String> borrowedBooks = new Stack<>();

    public void borrowBook(String book) {
        borrowedBooks.push(book);
        System.out.println("Borrowed: " + book);
    }

    public void returnBook() {
        if (!borrowedBooks.isEmpty()) {
            String book = borrowedBooks.pop();
            System.out.println("Returned: " + book);
        } else {
            System.out.println("No books to return.");
        }
    }

    public void showBorrowedBooks() {
        System.out.println("\nBooks currently borrowed: " + borrowedBooks);
    }

    // ✅ Small test main
    public static void main(String[] args) {
        System.out.println("Testing Library System...");
        LibrarySystem library = new LibrarySystem();

        library.borrowBook("Data Structures");
        library.borrowBook("Java Programming");
        library.showBorrowedBooks();

        library.returnBook();
        library.showBorrowedBooks();
    }
}
