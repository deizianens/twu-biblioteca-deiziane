package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866, false);
    Book book2 = new Book("Test", "Me", 2020, true);
    Book book3 = new Book("Test2", "Me", 2010, false);

    @Test
    public void viewBookTest(){
        assertEquals(book1.getBook(0),"0. Crime and Punishment | Fyodor Dostoyevsky | 1866\n");
        assertEquals(book2.getBook(1),"");
    }

    @Test
    public void checkoutBookTest() {
        assertEquals(book3.getBook(1),"1. Test2 | Me | 2010\n");
        book3.checkBook();
        assertEquals(book3.getBook(1),"");
    }

    @Test
    public void checkoutBookSuccessTest() {
        assertEquals(book1.checkBook(),"Thank you! Enjoy the book");
        assertEquals(book2.checkBook(),"Sorry, that book is not available");
    }

    @Test
    public void returnBookTest() {
        book1.returnBook();
        assertEquals(book1.getBook(0),"0. Crime and Punishment | Fyodor Dostoyevsky | 1866\n");
    }

    @Test
    public void returnBookSuccessTest() {
        assertEquals(book2.returnBook(), "Thank you for returning the book");
        assertEquals(book1.returnBook(), "That is not a valid book to return.");
    }

}
