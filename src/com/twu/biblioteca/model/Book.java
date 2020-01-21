package com.twu.biblioteca.models;

public class Book implements Item {
    private String bookName;
    private String bookAuthor;
    private String bookYear;

    public Book(String bookName, String bookAuthor, String bookYear) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return (this.bookName + " | " + this.bookAuthor + " | " + this.bookYear);
    }


}
