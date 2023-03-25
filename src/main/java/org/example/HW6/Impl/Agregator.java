package org.example.HW6.Impl;

import org.example.HW6.Book;

public class Agregator implements BookCart{
    public static int count = 0;
    public Book book;
    public BookGenre genre;

    public Agregator(Book book, BookGenre genre) {
        this.book = book;
        this.genre = genre;
    }

    public Agregator() {
    }

    @Override
    public String toString() {
        return "Agregator{" +
                "author=" + book.getAuthor() +
                ", genre=" + genre.getGenre() +
                '}';
    }

    @Override
    public Agregator GenerateBook() {
        count++;
        return new Agregator(new Book(10, "title", "Author", 2023), new BookGenre());
    }
}
