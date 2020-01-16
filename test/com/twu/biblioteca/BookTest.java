package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookTest {
    Book book1 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", "1866", false);
    Book book2 = new Book("Test", "Me", "2020", true);
    Book book3 = new Book("Test2", "Me", "2010", false);

    String line = "Crime and Punishment,Fyodor Dostoyevsky,1866";

    @Test
    public void createBookTest() {
        Book book  = Book.createBook(this.line);
        assertThat(book.getName(), is("Crime and Punishment"));
        assertThat(book.getAuthor(), is("Fyodor Dostoyevsky"));
        assertThat(book.getYear(), is("1866"));
    }



}
