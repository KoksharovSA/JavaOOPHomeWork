package org.example.HW6.Impl;

import org.example.HW6.ElectronBook;

import java.util.List;

public class HTMLFormatter implements Formatter{
    @Override
    public String Format(List<ElectronBook> bookList) {
        return "HTMLFormatter" + bookList.toString();
    }
}
