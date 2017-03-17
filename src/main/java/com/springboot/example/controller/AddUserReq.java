package com.springboot.example.controller;

/**
 * Created by chuangyang
 * Time : 19:00
 * Date: 2017/3/17.
 */
public class AddUserReq extends BaseReq {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
