package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book cc = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866, false);
    Book tt = new Book("Test", "Me", 2020, true);

    @Test
    public void viewBook(){
        assertEquals(cc.getBook(),"Crime and Punishment | Fyodor Dostoyevsky | 1866");
        assertEquals(tt.getBook(),"");
    }


}
