package com.twu.biblioteca.model;

public interface Item {
    String toString(int i);

    boolean isCheckedOut();

    void checkItem();

    void returnItem();
}
