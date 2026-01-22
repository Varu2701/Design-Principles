package com.epam.campus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages book-related operations in the library.
 */
public class BookManager implements IBookManager {
    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (book == null)
            throw new IllegalArgumentException("Book cannot be null");
        if (books.contains(book))
            throw new IllegalArgumentException("Book already exists: " + book);
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        if (book == null)
            throw new IllegalArgumentException("Book cannot be null");
        if (!books.remove(book))
            throw new IllegalArgumentException("Book not found: " + book);
    }

    @Override
    public boolean hasBook(Book book) {
        if (book == null)
            return false;
        return books.contains(book);
    }

    @Override
    public List<Book> listBooks() {
        return Collections
.unmodifiableList(books);
    }
}