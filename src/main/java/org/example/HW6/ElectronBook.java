package org.example.HW6;

public class ElectronBook extends Book{
    private String type;
    private int size;

    public ElectronBook(int pages, String title, String author, int year, String type, int size) {
        super(pages, title, author, year);
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ElectronBook(String type, int size) {
        this.type = type;
        this.size = size;
    }
}
