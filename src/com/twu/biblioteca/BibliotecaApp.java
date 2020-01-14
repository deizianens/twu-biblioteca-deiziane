package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n");

        Book pp = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943);
        Book ventos = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book gt = new Book("Game of Thrones", "George RR Martin", 1996);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(pp);
        bookList.add(ventos);
        bookList.add(gt);

        getBooksList(bookList);
    }

     static void getBooksList(List<Book> bookList) {
        for (Book temp : bookList) {
            System.out.println(temp.getBook());
        }
    }
}
