package com.epam.campus;

/**
 * Represents a book in the library.
 */
public class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be null or empty");
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cannot be null or empty");
        if (isbn == null || isbn.trim().isEmpty())
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        this.title = title.trim();
        this.author = author.trim();
        this.isbn = isbn.trim();
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s by %s (ISBN: %s)", title, author, isbn);
    }
}