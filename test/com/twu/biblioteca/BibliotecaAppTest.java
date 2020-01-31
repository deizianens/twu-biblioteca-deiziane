package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.InputMismatchException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaAppTest {

    BibliotecaApp app = new BibliotecaApp();

    //  The ExpectedException rule allows you to verify that your code throws a specific exception.
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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


//    @Test
//    public void testInvalidOption() {
//        expectedException.expect(InputMismatchException.class);
//        expectedException.expectMessage("Please select a valid option!");
//    }

}
