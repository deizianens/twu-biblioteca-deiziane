package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private Integer year;

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
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

    String getBook() {
        return(getName()+" | "+getAuthor()+" | "+getYear());
    }
}
