package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<Book>();


    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void getBookList() {
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString(i));
        }
    }


    public String checkOutBook(int bookIndex) {
        if(!bookList.get(bookIndex).isCheckedOut()) {
            bookList.get(bookIndex).checkBook();
            return ("Thank you! Enjoy the book");
        }
        else {
            return ("Sorry, that book is not available");
        }

    }

    public String returnBook(int bookIndex) {
        if(bookList.get(bookIndex).isCheckedOut()) {
            bookList.get(bookIndex).returnBook();
            return ("Thank you for returning the book");
        }
        else {
            return ("That is not a valid book to return.");
        }
    }
}
