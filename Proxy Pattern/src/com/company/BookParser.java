package com.company;

//subject
public class BookParser implements IBookParser{
    private String book;
    private int size;
    public BookParser(String book) {
        this.book = book;
        this.size = book.length();
    }

    public String getBook() {
        return book;
    }

    public int getSize() {
        return size;
    }
}
