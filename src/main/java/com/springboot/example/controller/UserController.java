package com.springboot.example.controller;

import com.springboot.example.bean.Users;
import com.springboot.example.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chuangyang
 * Time : 13:25
 * Date: 2017/3/17.
 */
@RestController
@RequestMapping("/users")


public class UserController {

    @Resource
    private UserRepository repository;

    @GetMapping("/hello")
    public Map getHello() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "Hello world");
        return map;
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable("id") int id, String name) {
        Users users =  repository.findOne(id);
        users.setName(name);
        repository.save(users);

        return repository.findOne(id);
    }

    @GetMapping("/getUserByName")
    public List<Users> getUserByName(String name) {
        return repository.findUsersByName(name);
    }

    @GetMapping("/getAllUser")
    public Map<String, Object> getAllUser() {
        Map<String, Object> result= new HashMap<>();
        result.put("errorCode", 0);
        result.put("errorMsg", "success");
        result.put("data", repository.findAll());
        return result;
    }

    @GetMapping("/getUserOfAge")
    public List<Users> getUserOfAge(int age) {
        return  repository.findUserOfAge(age);
    }

    @GetMapping("/addUser")
    public Map<String, Object> addUser(String name, int age) {
        //UserRepository users =  new UserRepository();
        /*UserRepository users = new UserRepository();
        users.setName(name);
        users.setAge(age);
        repository.save(users);*/
        Map<String, Object> result = new HashMap<>();
        result.put("errorCode", 0);
        result.put("errorMsg", "success");
        result.put("data", "");
        return result;
    }

}
