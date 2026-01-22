package com.epam.campus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages user-related operations in the library.
 */
public class UserManager implements IUserManager {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        if (user == null)
            throw new IllegalArgumentException("User cannot be null");
        if (users.contains(user))
            throw new IllegalArgumentException("User already exists: " + user);
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        if (user == null)
            throw new IllegalArgumentException("User cannot be null");
        if (!users.remove(user))
            throw new IllegalArgumentException("User not found: " + user);
    }

    @Override
    public boolean hasUser(User user) {
        if (user == null)
            return false;
        return users.contains(user);
    }

    @Override
    public List<User> listUsers() {
        return Collections.unmodifiableList(users);
    }
}