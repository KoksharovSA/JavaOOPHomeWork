package org.example.HW6;
import org.example.HW6.Impl.Searchable;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> bookList;

    public void addBook(Book book){
        bookList.add(book);
    }
    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getTitle().equals(title)){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getTitle().equals(author)){
                result.add(book);
            }
        }
        return result;
    }
}
