package com.twu.biblioteca;

import com.twu.biblioteca.application.LibrarySection;
import com.twu.biblioteca.domain.Book;
import com.twu.biblioteca.domain.Movie;
import com.twu.biblioteca.domain.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    BibliotecaApp app = new BibliotecaApp();
    LibrarySection lib = new LibrarySection();

    User testUser = new User("Bob", "bob@mail.com", "91920192", "999-9999", "pass");
    User testUser2 = new User("Ana", "ana@mail.com", "91920192", "123-9999", "pass2");

    Book book1 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", "1866", false);
    Book book2 = new Book("Test", "Me", "2020", false);
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
        assertEquals(lib.checkOutItem(0, testUser), "Thank you! Enjoy the book");
        assertEquals(lib.checkOutItem(0, testUser), "Sorry, that book is not available");
        assertEquals(lib.checkOutItem(0, testUser2), "Sorry, that book is not available");

        assertEquals(lib.checkOutItem(1, testUser2), "Thank you! Enjoy the book");
        assertEquals(lib.checkOutItem(1, testUser2), "Sorry, that book is not available");

        assertEquals(lib.checkOutItem(3, testUser), "Thank you! Enjoy the movie");
        assertEquals(lib.checkOutItem(3, testUser), "Sorry, that movie is not available");

    }


    @Test
    public void returnSuccessTest() {
        lib.checkOutItem(0, testUser);
        lib.checkOutItem(1, testUser2);

        assertEquals(lib.returnItem(0, testUser), "Thank you for returning the book");

        assertEquals(lib.returnItem(1, testUser), "That is not a valid book to return.");
        assertEquals(lib.returnItem(1, testUser2), "Thank you for returning the book");
    }

}
