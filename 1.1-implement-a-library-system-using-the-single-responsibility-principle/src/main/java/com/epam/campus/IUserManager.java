package com.epam.campus;

import java.util.List;

/**
 * Interface for user management operations.
 */
public interface IUserManager {
    void addUser(User user);
    void removeUser(User user);
    boolean hasUser(User user);
    List<User> listUsers();
}