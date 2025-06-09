package com.aziko.service.impl;

import com.aziko.dao.UserDao;
import com.aziko.dao.impl.UserDaoImpl;
import com.aziko.pojo.User;
import com.aziko.service.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserServiceImpl implements UserService {


    private UserDao userDao=new UserDaoImpl();

    @Override
    public List<User> findAll() {
        List<String> lines = userDao.findAll();

        //2.封装成user对象 -> list集合
        List<User> userList = lines.stream().map(line -> { //lambda表达式，stream函数式编程风格
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).toList();
        return userList;
    }
}
