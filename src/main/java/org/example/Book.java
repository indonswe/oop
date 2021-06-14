package org.example;

public class Book {
    int isbn;
    String name;
    Author author;

    public Book(int isbn, String name, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        author.setBooks(this);

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
