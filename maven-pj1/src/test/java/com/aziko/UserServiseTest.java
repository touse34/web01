package com.aziko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiseTest {

    @Test
    public void testGetAge(){
        UserService usrsvice =  new UserService();
        Integer age = usrsvice.getAge("330203200505243618");
        System.out.println(age);
    }

    /**
     * 断言
     */
    @Test
    public void testGenderWithAssert(){
        UserService usrsvice = new UserService();
        String gender = usrsvice.getGender("330203200505243618");
        //Assertions.assertEquals("男", gender, "逻辑有问题");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usrsvice.getGender(null);
        });   //测试抛出的异常对不对
    }
}
