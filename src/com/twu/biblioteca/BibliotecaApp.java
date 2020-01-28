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
    static List<User> users = new ArrayList();
    static User currentUser = new User();

    public static void main(String[] args) throws Exception {
        registerUser();

        while(true) {
            System.out.println("1.Login\n2.Exit");
            int option = input.nextInt();

            if(option == 1) {
                if (login()) {
                    System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
                    readItems("src/com/twu/biblioteca/resources/books.txt", "src/com/twu/biblioteca/resources/movies.txt");

                    while (true) {
                        showMenu();
                    }
                } else {
                    System.out.println("Invalid user, please digit your credentials again.");
                }
            }
            else {
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }

    public static boolean login() {
        System.out.println("Digit your credentials\nLibrary Number");
        String libraryNumber = input.next();
        System.out.println("Password:");
        String password = input.next();

        return(isValidUser(libraryNumber, password));
    }

    public static void showMenu() {
        System.out.println("\nChoose one option:\n1.See list of books\n2.Get a book\n3.Return a book\n4.See list of movies\n5.Get a movie\n6.See my account info\n0.Quit\n");
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
            case 6:
                System.out.println(currentUser.toString());
            case 0:
                System.exit(0);
            default:
                System.out.println("Please select a valid option!\n");
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
        System.out.println(books.checkOutItem(index, currentUser));
    }

    public static void checkMovie(){
        System.out.println("Choose a movie: ");
        movies.getAvailableItemsList();
        int index = input.nextInt();
        System.out.println(movies.checkOutItem(index, currentUser));
    }

    public static void returnBook() {
        System.out.println("Choose the book you want to return: ");
        books.getUserItemsList(currentUser);
        int index = input.nextInt();
        System.out.println(books.returnItem(index));
    }

    public static void registerUser() {
        users.add(new User("User","user@mail.com", "(31)1234-3322","999-9999", "pass"));
        users.add(new User("User2","user2@mail.com", "(31)2931-2221","123-9999", "pass1"));
    }

    public static boolean isValidUser(String userLibraryNumber, String userPassword){
        for(User user: users){
            if(userLibraryNumber.equals(user.getLibraryNumber()) && userPassword.equals(user.getPassword())) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public List<User> getUsers() {
        return users;
    }
}
