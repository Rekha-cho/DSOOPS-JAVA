package com.rekha.Day57;

class Book{
    String authorName;
    String bookName;
    static String seller = "ABC";
    Book(String authorName, String bookName){
        this.authorName=authorName;
        this.bookName=bookName;
    }

    public static void main(String[] args){
        Book b1 = new Book("Hello", "Me");
        System.out.println("Author Name: " +b1.authorName + " Book name: " +b1.bookName + " seller: " + seller);
    }
}


