package com.twu.biblioteca;
import com.twu.biblioteca.application.LibrarySection;
import com.twu.biblioteca.domain.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    LibrarySection lib;

    @Before
    public void init(){
        this.lib = new LibrarySection();
    }

    @Test
    public void verifyCreateAMovie() {
        Movie movie = Movie.createMovie("Frozen 2,2019,Chris Buck and Jennifer Lee,7.2");
        assertEquals("1. Frozen 2 | 2019 | Chris Buck and Jennifer Lee | 7.2", movie.toString(1));
    }
}
