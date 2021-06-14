package org.example;

public class Author {
    int pN;
    String name;
    Book[]books = new Book[0];

    public Author(int pN, String name, Book[] books) {
        this.pN = pN;
        this.name = name;
        this.books = books;
    }

    public Author(int pN, String name) {
        this.pN = pN;
        this.name = name;

    }



    public int getpN() {
        return pN;
    }

    public void setpN(int pN) {
        this.pN = pN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        int amount = books.length;
        Book[] newArray = new Book[amount+1];
        for (int i = 0;i < amount; i++)
        {
            newArray[i] = books[i];
        }
        newArray[amount] = book;
        books = newArray;
    }
}
