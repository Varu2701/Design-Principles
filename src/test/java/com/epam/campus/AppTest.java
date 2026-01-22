package com.epam.campus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testBookManager() {
        IBookManager bm = new BookManager();
        Book book = new Book("Test Book", "Test Author", "1234567890");
        bm.addBook(book);
        assertTrue(bm.hasBook(book));
        bm.removeBook(book);
        assertFalse(bm.hasBook(book));
    }

    @Test
    public void testUserManager() {
        IUserManager um = new UserManager();
        User user = new User("Test User", "U100");
        um.addUser(user);
        assertTrue(um.hasUser(user));
        um.removeUser(user);
        assertFalse(um.hasUser(user));
    }

    @Test
    public void testNullBook() {
        IBookManager bm = new BookManager();
        assertThrows(IllegalArgumentException.class, () -> bm.addBook(null));
    }

    @Test
    public void testNullUser() {
        IUserManager um = new UserManager();
        assertThrows(IllegalArgumentException.class, () -> um.addUser(null));
    }

    @Test
    public void testDuplicateBook() {
        IBookManager bm = new BookManager();
        Book book = new Book("Test Book", "Test Author", "1234567890");
        bm.addBook(book);
        assertThrows(IllegalArgumentException.class, () -> bm.addBook(book));
    }

    @Test
    public void testDuplicateUser() {
        IUserManager um = new UserManager();
        User user = new User("Test User", "U100");
        um.addUser(user);
        assertThrows(IllegalArgumentException.class, () -> um.addUser(user));
    }
}