package com.aziko;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//表示这是一个请求处理类
public class HelloController {


    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("name: " + name);
        return "hello" + name + "!";
    }
}
