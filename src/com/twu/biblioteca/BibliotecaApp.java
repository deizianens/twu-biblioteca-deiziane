package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n");

        Book pp = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943);
        Book ventos = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book gt = new Book("Game of Thrones", "George RR Martin", 1996);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(pp);
        bookList.add(ventos);
        bookList.add(gt);

        System.out.println("Choose one option:\n1.See list of books");
        Integer option = input.nextInt();

        switch (option) {
            case 1:
                getBooksList(bookList);
        }
    }

     static void getBooksList(List<Book> bookList) {
        for (Book temp : bookList) {
            System.out.println(temp.getBook());
        }
    }
}
