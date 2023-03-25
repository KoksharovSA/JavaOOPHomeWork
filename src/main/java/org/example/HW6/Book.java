package org.example.HW6;

public class Book {
    private int pages;
    private String title;
    private String author;
    private int year;

    public Book(int pages, String title, String author, int year) {
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
