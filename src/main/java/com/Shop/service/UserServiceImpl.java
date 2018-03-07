package com.Shop.service;

import com.Shop.dao.UserDao;
import com.Shop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.readAll();
    }

    @Override
    public void addUser(User user) {
        userDao.create(user);
    }
}
