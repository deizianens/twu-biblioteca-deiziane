package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library lib = new Library();
    Book book1 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", "1866", false);
    Book book2 = new Book("Test", "Me", "2020", true);
    Book book3 = new Book("Test2", "Me", "2010", false);

    @Before
    public void init() {
        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(book3);
    }

    @Test
    public void checkoutBookSuccessTest() {
        assertEquals(lib.checkOutItem(0),"Thank you! Enjoy the book");
        assertEquals(lib.checkOutItem(1),"Sorry, that book is not available");
    }

    @Test
    public void returnBookSuccessTest() {
        assertEquals(lib.returnItem(1), "Thank you for returning the book");
        assertEquals(lib.returnItem(0), "That is not a valid book to return.");
    }
}
