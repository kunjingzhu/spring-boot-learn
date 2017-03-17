package com.springboot.example.controller;

import com.springboot.example.bean.Users;

/**
 * Created by chuangyang
 * Time : 18:56
 * Date: 2017/3/17.
 */
public class AddUserResp extends BaseResp<Users> {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
