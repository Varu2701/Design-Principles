package com.epam.campus;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public boolean hasBook(String book) {
        return books.contains(book);
    }

    public List<String> listBooks() {
        return new ArrayList<>(books);
    }
}