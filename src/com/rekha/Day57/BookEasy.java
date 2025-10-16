package com.rekha.Day57;

public class BookEasy {
    static int totalBooks = 0;
    String title;

    BookEasy(String title) {
        this.title = title;
        totalBooks++;
    }

    public static void main(String[] args) {
        BookEasy book1 = new BookEasy("ABC");
        BookEasy book2 = new BookEasy("XYZ");

        System.out.println("Book 1 Title: " + book1.title);
        System.out.println("Book 2 Title: " + book2.title);
        System.out.println("Total Books: " + BookEasy.totalBooks);
    }
}
