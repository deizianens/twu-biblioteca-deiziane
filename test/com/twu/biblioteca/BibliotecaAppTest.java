package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaAppTest {

    BibliotecaApp app = new BibliotecaApp();

    @Before
    public void init() {
       app.registerUser();
    }

    @Test
    public void testValidUser() {
        assertThat(app.isValidUser(app.getUsers().get(0).getLibraryNumber(), app.getUsers().get(0).getPassword()), is(true));
    }

    @Test
    public void testInvalidUser() {
        assertThat(app.isValidUser("092-2332", "pas"), is(false));
    }




}
