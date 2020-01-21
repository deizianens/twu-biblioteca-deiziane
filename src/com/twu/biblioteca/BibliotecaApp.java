package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

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
        readItems("src/com/twu/biblioteca/file/books.txt", "src/com/twu/biblioteca/file/movies.txt");

        while(true) {
            System.out.println("\nChoose one option:\n1.See list of books\n2.Get a book\n3.Return a book\n4.See list of movies\n0.Quit\n");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    books.getItemsList();
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

    static void readItems(String path, String moviePath) throws Exception {
        File bookFile = new File(path);
        File movieFile = new File(moviePath);
        BufferedReader reader = new BufferedReader(new FileReader(bookFile));
        BufferedReader reader2 = new BufferedReader(new FileReader(movieFile));

        String line;
        while ((line = reader.readLine()) != null)
            books.addItem(Book.createBook(line));

        while ((line = reader2.readLine()) != null)
            movies.addItem(Movie.createMovie(line));
    }
}
