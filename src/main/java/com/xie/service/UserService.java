package com.xie.service;

import com.xie.domain.User;

public interface UserService {

    User findUserByUserName(String userName);

    void addUser(User user);
}
