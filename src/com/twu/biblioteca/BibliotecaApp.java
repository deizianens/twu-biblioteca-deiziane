package com.twu.biblioteca;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    static Scanner input = new Scanner(System.in);
    public Library library = new Library();

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        while(true) {
            System.out.println("\nChoose one option:\n1.See list of books\n2.Get a book\n3.Return a book\n0.Quit\n");
            int option = input.nextInt();

//            switch (option) {
//                case 1:
//                    getAvailableBooksList(bookList);
//                    break;
//                case 2:
//                    checkOutBook(bookList);
//                    break;
//                case 3:
//                    returnBook(bookList);
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("Please select a valid option!\n");
//            }
        }
    }

    static void readBooks(String path) throws Exception {
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null)
            Book.createBook(line);
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
        System.out.println("Choose a book to get:");
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
