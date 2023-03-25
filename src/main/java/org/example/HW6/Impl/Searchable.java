package org.example.HW6.Impl;

import org.example.HW6.Book;

import java.util.List;

public interface Searchable {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
}
