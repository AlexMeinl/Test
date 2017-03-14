package com.service;

import com.dao.TestBase;
import com.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceBaseImpl implements ServiceBase {

    private TestBase testBase;

    public void setTestBase(TestBase testBase) {
        this.testBase = testBase;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.testBase.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.testBase.updateUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.testBase.removeUser(id);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return this.testBase.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> getUserByName(String name) {
        return this.testBase.getUserByName(name);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return this.testBase.listUsers();
    }
}
