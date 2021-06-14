package org.example;

import java.util.Arrays;

public class Author {

    Author[]authors = new Author[15];

    int pN;
    String name;
    Book[]books = new Book[0];

    public Author(int pN, String name, Book[] books) {
        this.pN = pN;
        this.name = name;
        this.books = books;
        authors[Authorsequencer.getCounter()]=this;
    }

    public Author(int pN, String name) {
        this.pN = pN;
        this.name = name;
        authors[Authorsequencer.getCounter()]=this;
    }

    public Author[] getAuthors() {
        return authors;
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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
