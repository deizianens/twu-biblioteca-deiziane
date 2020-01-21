package com.twu.biblioteca.models;

import com.twu.biblioteca.models.Item;

public class Movie  implements Item {
    private String movieName;
    private String movieYear;
    private String movieDirector;
    private String movieRating;

    public Movie(String movieName, String movieYear, String movieDirector, String movieRating) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return (this.movieName + " | " + this.movieYear + " | " + this.movieDirector + " | " + this.movieRating);
    }
}
