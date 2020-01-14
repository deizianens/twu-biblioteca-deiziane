package com.twu.biblioteca;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        Book pp = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943, false);
        Book ventos = new Book("Pride and Prejudice", "Jane Austen", 1813, true);
        Book gt = new Book("Game of Thrones", "George RR Martin", 1996, false);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(pp);
        bookList.add(ventos);
        bookList.add(gt);

        while(true) {
            System.out.println("\nChoose one option:\n1.See list of books\n2.Get a book\n3.Return a book\n0.Quit\n");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    getAvailableBooksList(bookList);
                    break;
                case 2:
                    checkOutBook(bookList);
                    break;
                case 3:
                    returnBook(bookList);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please select a valid option!\n");
            }
        }
    }

     static void getAvailableBooksList(List<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i).getBook(i));
        }
    }

    static void getNotAvailableBooksList(List<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i).getCheckedBook(i));
        }
    }

    static void checkOutBook(List<Book> bookList) {
        System.out.println("Choose a book:");
        getAvailableBooksList(bookList);

        int option = input.nextInt();
        // Option here is the index of the book on arraylist
        System.out.println(bookList.get(option).checkBook());

    }

    static void returnBook(List<Book> bookList) {
        System.out.println("Choose a book to return:");
        getNotAvailableBooksList(bookList);

        int option = input.nextInt();
        // Option here is the index of the book on arraylist
        System.out.println(bookList.get(option).returnBook());

    }
}
