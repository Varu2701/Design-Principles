package com.epam.campus;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user);
    }

    public void removeUser(String user) {
        users.remove(user);
    }

    public List<String> listUsers() {
        return new ArrayList<>(users);
    }
}