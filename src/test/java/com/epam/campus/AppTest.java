package com.epam.campus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testBookManager() {
        BookManager bm = new BookManager();
        bm.addBook("Test Book");
        assertTrue(bm.hasBook("Test Book"));
        bm.removeBook("Test Book");
        assertFalse(bm.hasBook("Test Book"));
    }

    @Test
    public void testUserManager() {
        UserManager um = new UserManager();
        um.addUser("Test User");
        assertTrue(um.listUsers().contains("Test User"));
        um.removeUser("Test User");
        assertFalse(um.listUsers().contains("Test User"));
    }
}