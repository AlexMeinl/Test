package com.dao;

import com.model.User;

import java.util.List;

public interface TestBase {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
    User getUserById(int id);
    List<User> getUserByName(String name);
    List<User> listUsers();
}
