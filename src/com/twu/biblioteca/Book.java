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

    static Book createBook(String line){
        String[] bookInfo = line.split(",");
        Book book = new Book(bookInfo[0], bookInfo[1], bookInfo[2], false);
        return book;
    }

    String getBook(int i) {
        if (!isCheckedOut()) {
            return (i+". "+getName() + " | " + getAuthor() + " | " + getYear()+"\n");
        }
        else {
            return("");
        }
    }

    String getCheckedBook(int i) {
        if (isCheckedOut()) {
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

    public String returnBook() {
        if(isCheckedOut()) {
            this.checkedOut = false;
            return ("Thank you for returning the book");
        }
        else {
            return ("That is not a valid book to return.");
        }
    }
}
