package org.example.HW6.Impl;

public class BookGenre implements Genre{
    private String bookGenre;

    public BookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public BookGenre() {
        bookGenre = "Fantasy";
    }

    @Override
    public String getGenre() {
        return null;
    }
}
