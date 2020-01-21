package com.twu.biblioteca.model;

public class Movie  implements Item {
    private String movieName;
    private String movieYear;
    private String movieDirector;
    private String movieRating;
    private boolean checkedOut;

    public Movie(String movieName, String movieYear, String movieDirector, String movieRating, boolean checkedOut) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
        this.checkedOut = checkedOut;
    }

    public static Movie createMovie(String line) {
        String[] movieInfo = line.split(",");
        Movie movie = new Movie(movieInfo[0], movieInfo[1], movieInfo[2], movieInfo[3], false);
        return movie;
    }

    @Override
    public String toString(int i) {
        return (+i+". "+this.movieName + " | " + this.movieYear + " | " + this.movieDirector + " | " + this.movieRating);
    }

    @Override
    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    @Override
    public void checkItem() {
        this.checkedOut = true;
    }

    @Override
    public void returnItem() {
        this.checkedOut = false;
    }

    @Override
    public String resultMessage() {
        if(!isCheckedOut()) {
            checkItem();
            return ("Thank you! Enjoy the movie");
        }
        else {
            return ("Sorry, that movie is not available");
        }
    }

}
