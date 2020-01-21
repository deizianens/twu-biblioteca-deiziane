package com.twu.biblioteca;git add * :/

import com.twu.biblioteca.model.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class BibliotecaApp {

    static Scanner input = new Scanner(System.in);

    static Library books = new Library();
    static Library movies = new Library();

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        readBooks("src/com/twu/biblioteca/files/books.txt");

        while(true) {
            System.out.println("\nChoose one option:\n1.See list of books\n2.Get a book\n3.Return a book\n0.Quit\n");
            int option = input.nextInt();

            switch (option) {
                case 1:
//                    books.getBookList();
                    break;
                case 2:
//                    checkOutBook();
                    break;
                case 3:
//                    returnBook();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please select a valid option!\n");
            }
        }
    }

    static void readBooks(String path) throws Exception {
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null)
            books.addItem(Book.createBook(line));
    }
}
