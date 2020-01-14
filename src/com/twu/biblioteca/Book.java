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

    boolean isCheckedOut() {
        return this.checkedOut;
    }

    String getBook(int i) {
        if (!isCheckedOut()) {
            return (i+". "+getName() + " | " + getAuthor() + " | " + getYear()+"\n");
        }
        else {
            return("");
        }
    }

    public String checkBook() {
        if(!isCheckedOut()) {
            this.checkedOut = true;
            return ("Thank you! Enjoy the book");
        }
        else {
            return ("Sorry, that book is not available");
        }

    }
}
