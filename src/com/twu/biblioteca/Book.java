package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private Integer year;
    private boolean checkedOut;

    public Book(String name, String author, Integer year, boolean checkedOut) {
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

    Integer getYear() {
        return this.year;
    }

    boolean getAvailability() {
        return this.checkedOut;
    }

    String getBook() {
        if (!getAvailability()) {
            return (getName() + " | " + getAuthor() + " | " + getYear()+"\n");
        }
        else {
            return("");
        }
    }
}
