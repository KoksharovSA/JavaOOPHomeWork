package org.example.HW6.Impl;

import org.example.HW6.ElectronBook;

import java.util.List;

public class JSONFormatter implements Formatter{
    @Override
    public String Format(List<ElectronBook> bookList) {
        return "JSONFormatter" + bookList.toString();
    }
}
