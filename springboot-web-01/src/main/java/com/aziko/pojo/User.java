package com.aziko.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data    //getter setter toString equals等方法
@NoArgsConstructor //无参构造器
@AllArgsConstructor //全参构造器
public class User {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    private LocalDateTime updateTime;

}
