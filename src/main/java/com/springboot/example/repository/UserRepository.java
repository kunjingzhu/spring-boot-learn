package com.springboot.example.repository;

import com.springboot.example.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by chuangyang
 * Time : 14:54
 * Date: 2017/3/17.
 */
public interface UserRepository extends JpaRepository<Users, Integer> {

    List<Users> findUsersByName(String name);

    /*@Query(value = "select * from users where age > ?1", nativeQuery = true)
    List<Users> findUserOfAge(int age);*/
    @Query("select u from Users u where u.age > ?1")
    List<Users> findUserOfAge(int age);
}
