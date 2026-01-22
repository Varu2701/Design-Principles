package com.epam.campus;

/**
 * Demonstrates the library system.
 */
public class App {
    public static void main(String[] args) {
        IBookManager bookManager = new BookManager();
        IUserManager userManager = new UserManager();

        // Create books and users
        Book book1 = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        User user1 = new User("Alice", "U001");
        User user2 = new User("Bob", "U002");

        // Add books and users
        bookManager.addBook(book1);
        bookManager.addBook(book2);
        userManager.addUser(user1);
        userManager.addUser(user2);

        // List books and users
        System.out.println("Books in library:");
        for (Book b : bookManager.listBooks()) {
            System.out.println(" - " + b);
        }

        System.out.println("Users in library:");
        for (User u : userManager.listUsers()) {
            System.out.println(" - " + u);
        }

        // Remove a book and a user
        bookManager.removeBook(book1);
        userManager.removeUser(user2);

        System.out.println("\nAfter removal:");
        System.out.println("Books: " + bookManager.listBooks());
        System.out.println("Users: " + userManager.listUsers());
    }
}