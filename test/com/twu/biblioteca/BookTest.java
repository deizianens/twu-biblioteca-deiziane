package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book cc = new Book("Crime e Castigo");

    @Test
    public void viewBookName(){
        assertEquals(cc.getName(),"Crime e Castigo");
    }
}
