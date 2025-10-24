package models;

public class Book {
    String title;
    String author;
    String ISBN;
    boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        String status = isAvailable ? "Available" : "Borrowed";
        return title + " by " + author + " (ISBN: " + ISBN + ") - " + status;
    }
}
