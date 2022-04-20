package com.company;
//lazy class
public class Proxy implements IBookParser{
    private BookParser parser = null;
    private String book;
    public  Proxy(String book){
        this.book = book;
    }
    @Override
    public String getBook() {
        return checkExistence().getBook();
    }

    @Override
    public int getSize() {
        return checkExistence().getSize();
    }
    private BookParser checkExistence() {
        return this.parser == null? new BookParser(this.book) : parser;
    }
}
