package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private String year;
    private boolean checkedOut;

    public Book(String name, String author, String year, boolean checkedOut) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.checkedOut = checkedOut;
    }

    String getName() {
        return this.name;
    }

    String getAuthor() {
        return this.author;
    }

    String getYear() {
        return this.year;
    }

    boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void checkBook() {
        this.checkedOut = true;
    }

    public void returnBook() {
        this.checkedOut = false;
    }

    static Book createBook(String line){
        String[] bookInfo = line.split(",");
        Book book = new Book(bookInfo[0], bookInfo[1], bookInfo[2], false);
        return book;
    }

    String toString(int i) {
        return (i+". "+getName() + " | " + getAuthor() + " | " + getYear());
    }


}
