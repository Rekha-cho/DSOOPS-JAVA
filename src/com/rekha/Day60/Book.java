package com.rekha.Day60;

public class Book {

    // Instance variables
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    // Static variables (shared by all books)
    private static int totalBooks = 0;
    private static int issuedBooks = 0;

    // Default constructor
    public Book() {
        this(0, "Unknown", "Unknown");
    }

    // Parameterized constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;

        // Thread-safe increment of totalBooks
        synchronized (Book.class) {
            totalBooks++;
        }
    }

    // Instance method to issue a book
    public void issueBook() {
        synchronized (Book.class) {
            if (!isIssued) {
                isIssued = true;
                issuedBooks++;
                System.out.println("Book \"" + title + "\" has been issued.");
            } else {
                System.out.println("Book \"" + title + "\" is already issued.");
            }
        }
    }

    // Instance method to return a book
    public void returnBook() {
        synchronized (Book.class) {
            if (isIssued) {
                isIssued = false;
                issuedBooks--;
                System.out.println("Book \"" + title + "\" has been returned.");
            } else {
                System.out.println("Book \"" + title + "\" was not issued.");
            }
        }
    }

    // Static method to show library statistics
    public static void showLibraryStats() {
        synchronized (Book.class) {
            System.out.println("\n📚 Library Statistics:");
            System.out.println("Total Books: " + totalBooks);
            System.out.println("Issued Books: " + issuedBooks);
            System.out.println("Available Books: " + (totalBooks - issuedBooks));
        }
    }

    // Display details of a book
    public void displayBookInfo() {
        System.out.println("\nBook ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Python Basics", "Guido van Rossum");
        Book b3 = new Book(); // uses default constructor

        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();

        b1.issueBook();
        b2.issueBook();
        b2.issueBook(); // Try to issue already issued book

        Book.showLibraryStats();

        b2.returnBook();
        Book.showLibraryStats();
    }
}
