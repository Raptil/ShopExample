package com.Shop.service;


import com.Shop.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();
    public void addUser(User user);
}
