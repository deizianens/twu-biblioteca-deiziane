package com.twu.biblioteca.model;

public class Movie  extends Item {
    private String movieDirector;
    private String movieRating;

    public Movie(String movieName, String movieYear, String movieDirector, String movieRating, boolean checkedOut) {
        super(movieName, movieYear, checkedOut);
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    public static Movie createMovie(String line) {
        String[] movieInfo = line.split(",");
        Movie movie = new Movie(movieInfo[0], movieInfo[1], movieInfo[2], movieInfo[3], false);
        return movie;
    }

    @Override
    public String toString(int i) {
        return (+i+". "+super.getItemName() + " | " + super.getItemYear() + " | " + this.movieDirector + " | " + this.movieRating);
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
