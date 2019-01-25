package com.xie.controller;

import com.xie.domain.User;
import com.xie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{userId}")
    @ResponseBody
    public User queryUser(@PathVariable Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("张三");
        user.setGender("男");
        user.setBirthday(new Date());
        return userService.findUserById(userId);
    }
}
