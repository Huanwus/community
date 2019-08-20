package com.lwuhan.community;

/**
 * @Auther: wuhan
 * @Date: 2019/8/17 11:25
 * @Description:
 */
public class User{
    private String name;
    private int age;
    User(String name, int age){
        this.name = name;
        this.age = age;
    }
    int getAge(){
        return age;
    }
}