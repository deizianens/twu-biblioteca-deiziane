package com.twu.biblioteca.domain;

public class Book extends Item {
    private String bookAuthor;

    public Book(String bookName, String bookAuthor, String bookYear, boolean checkedOut) {
        super(bookName, bookYear, checkedOut);
        this.bookAuthor = bookAuthor;
    }

    public static Book createBook(String line) {
        String[] bookInfo = line.split(",");
        Book book = new Book(bookInfo[0], bookInfo[1], bookInfo[2], false);
        return book;
    }

    @Override
    public String toString(int i) {
        return (+i+". "+super.getItemName() + " | " + this.bookAuthor + " | " + super.getItemYear());
    }


    @Override
    public String checkoutResultMessage() {
        if(!isCheckedOut()) {
            checkItem();
            return ("Thank you! Enjoy the book");
        }
        else {
            return ("Sorry, that book is not available");
        }
    }

    @Override
    public String returnResultMessage(User currentUser) {
        if(isCheckedOut() && super.getItemUser().equals(currentUser)) {
            returnItem();
            setUser(new User());
            return ("Thank you for returning the book");
        }
        else {
            return ("That is not a valid book to return.");
        }
    }


}
