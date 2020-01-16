package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<Book>();


    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public List getBookList() {
        return this.bookList;
    }
}
