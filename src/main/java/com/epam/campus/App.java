package com.epam.campus;

public class App {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        UserManager userManager = new UserManager();

        bookManager.addBook("Clean Code");
        bookManager.addBook("Effective Java");

        userManager.addUser("Alice");
        userManager.addUser("Bob");

        System.out.println("Books: " + bookManager.listBooks());
        System.out.println("Users: " + userManager.listUsers());
    }
}