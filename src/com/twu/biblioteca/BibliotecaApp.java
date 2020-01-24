package com.twu.biblioteca;

import com.twu.biblioteca.application.LibrarySection;
import com.twu.biblioteca.domain.Book;
import com.twu.biblioteca.domain.Movie;
import com.twu.biblioteca.domain.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    static Scanner input = new Scanner(System.in);

    static LibrarySection books = new LibrarySection();
    static LibrarySection movies = new LibrarySection();
    public List<User> users = new ArrayList();

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        readItems("src/com/twu/biblioteca/resources/books.txt", "src/com/twu/biblioteca/resources/movies.txt");

        while(true) {
            System.out.println("\nChoose one option:\n1.See list of books\n2.Get a book\n3.Return a book\n4.See list of movies\n5.Get a movie\n0.Quit\n");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    books.getAvailableItemsList();
                    break;
                case 2:
                    checkBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    movies.getAvailableItemsList();
                    break;
                case 5:
                    checkMovie();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please select a valid option!\n");
            }
        }
    }

    public static void readItems(String path, String moviePath) throws Exception {
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

    public static void checkBook(){
        System.out.println("Choose a book: ");
        books.getAvailableItemsList();
        int index = input.nextInt();
        System.out.println(books.checkOutItem(index));
    }

    public static void checkMovie(){
        System.out.println("Choose a movie: ");
        movies.getAvailableItemsList();
        int index = input.nextInt();
        System.out.println(movies.checkOutItem(index));
    }

    public static void returnBook() {
        System.out.println("Choose the book you want to return: ");
        books.getNotAvailableItemsList();
        int index = input.nextInt();
        System.out.println(books.returnItem(index));
    }

    public static void login(){

    }
}
