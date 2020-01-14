package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book cc = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866);

    @Test
    public void viewBook(){
        assertEquals(cc.getBook(),"Crime and Punishment | Fyodor Dostoyevsky | 1866");
    }
}
