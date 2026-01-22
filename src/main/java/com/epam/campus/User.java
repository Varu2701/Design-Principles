package com.epam.campus;

/**
 * Represents a user of the library.
 */
public class User {
    private final String name;
    private final String userId;

    public User(String name, String userId) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        if (userId == null || userId.trim().isEmpty())
            throw new IllegalArgumentException("User ID cannot be null or empty");
        this.name = name.trim();
        this.userId = userId.trim();
    }

    public String getName() { return name; }
    public String getUserId() { return userId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s (ID: %s)", name, userId);
    }
}