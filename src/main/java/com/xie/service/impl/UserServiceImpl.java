package com.xie.service.impl;

import com.xie.domain.User;
import com.xie.mapper.UserMapper;
import com.xie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer userId) {
        return userMapper.selUserById(userId);
    }
}
