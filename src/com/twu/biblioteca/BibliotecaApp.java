package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        Book pp = new Book("O Pequeno Príncipe");
        Book ventos = new Book("O Morro dos Ventos Uivantes");
        Book gt = new Book("Guerra dos Tronos");

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(pp);
        bookList.add(ventos);
        bookList.add(gt);
    }


}
