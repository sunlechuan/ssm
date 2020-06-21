package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Test {

    @Autowired
    static UserService userService;

    public static void main(String[] args) {

        List<User> list = userService.list();
        for (User user : list) {
            System.out.println(user);
        }

    }
}
