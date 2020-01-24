package com.twu.biblioteca.domain;

public class User {
    private String name;
    private String libraryNumber;
    private String password;

    public User(String name, String libraryNumber, String password) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }
}
