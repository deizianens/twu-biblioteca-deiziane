package com.twu.biblioteca;

import com.twu.biblioteca.application.LibrarySection;
import com.twu.biblioteca.domain.Book;
import com.twu.biblioteca.domain.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    LibrarySection lib = new LibrarySection();
    Book book1 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", "1866", false);
    Book book2 = new Book("Test", "Me", "2020", true);
    Book book3 = new Book("Test2", "Me", "2010", false);
    Movie movie1 = new Movie("Movie Name", "2019", "Director", "9.9", false);

    @Before
    public void init() {
        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(book3);
        lib.addItem(movie1);
    }


    @Test
    public void checkoutSuccessTest() {
        assertEquals(lib.checkOutItem(0), "Thank you! Enjoy the book");
        assertEquals(lib.checkOutItem(1), "Sorry, that book is not available");
        assertEquals(lib.checkOutItem(3), "Thank you! Enjoy the movie");
    }

    @Test
    public void returnSuccessTest() {
        assertEquals(lib.returnItem(1), "Thank you for returning the book");
        assertEquals(lib.returnItem(0), "That is not a valid book to return.");
    }
}
