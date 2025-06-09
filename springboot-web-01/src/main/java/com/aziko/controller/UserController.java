package com.aziko.controller;

import com.aziko.pojo.User;
import com.aziko.service.UserService;
import com.aziko.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

    private UserService userService = new UserServiceImpl();

    @RequestMapping("/list")
    public List<User> list(){ //list集合自动转换成json

        List<User> userList = userService.findAll();

        //3.返回json
        return userList;

    }

}
