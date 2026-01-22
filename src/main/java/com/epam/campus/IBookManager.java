package com.epam.campus;

import java.util.List;

/**
 * Interface for book management operations.
 */
public interface IBookManager {
    void addBook(Book book);
    void removeBook(Book book);
    boolean hasBook(Book book);
    List<Book> listBooks();
}