package org.example.HW6.Impl;

import org.example.HW6.Book;
import org.example.HW6.ElectronBook;

import java.util.List;

public class NoFormatter implements Formatter{
    @Override
    public String Format(List<ElectronBook> bookList) {
        return "NoFormatter" + bookList.toString();
    }
}
