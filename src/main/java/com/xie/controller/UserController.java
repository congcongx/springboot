package com.xie.controller;

import com.xie.domain.Result;
import com.xie.domain.User;
import com.xie.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;



    @ApiOperation(value="查看日志",notes="根据访问查看系统日志")
    @GetMapping("/log")
    public Object testLog() {
        logger.debug("this is debug level");
        logger.info("this is info level");
        logger.warn("this is warn level");
        logger.error("this is error level");
        return "Hello World";
    }

    @RequestMapping(value = "/findUerByUserName")
    @ApiOperation(value = "查找用户",notes = "根据用户名查找用户")
    @ApiImplicitParam(paramType = "query",name = "userName",value = "用户名",required = true,dataType = "String")
    public Object findUserByName(String userName) {
        return userService.findUserByUserName(userName);
    }

    @PostMapping(value = "/add")
    @ApiOperation(value = "添加用户信息")
    public Object addUser(@RequestBody User user) {
        userService.addUser(user);
        return Result.ok();
    }
}
