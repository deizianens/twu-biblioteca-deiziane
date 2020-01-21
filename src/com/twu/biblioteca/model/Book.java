package com.twu.biblioteca.model;

public class Book implements Item {
    private String bookName;
    private String bookAuthor;
    private String bookYear;
    private boolean checkedOut;

    public Book(String bookName, String bookAuthor, String bookYear, boolean checkedOut) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.checkedOut = checkedOut;
    }

    public static Book createBook(String line) {
        String[] bookInfo = line.split(",");
        Book book = new Book(bookInfo[0], bookInfo[1], bookInfo[2], false);
        return book;
    }

    @Override
    public String toString(int i) {
        return (+i+". "+this.bookName + " | " + this.bookAuthor + " | " + this.bookYear);
    }

    @Override
    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    @Override
    public void checkItem() {
        this.checkedOut = true;
    }

    @Override
    public void returnItem() {
        this.checkedOut = false;
    }

    @Override
    public String resultMessage() {
        if(!isCheckedOut()) {
            checkItem();
            return ("Thank you! Enjoy the book");
        }
        else {
            return ("Sorry, that book is not available");
        }
    }


}
