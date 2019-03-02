package com.xie.mapper;


import com.xie.domain.User;

public interface UserMapper  {

    User selUserByUserName(String userName);

    void addUser(User user);
}
