package com.gxa.controller;

import com.gxa.entity.User;
import com.gxa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/user/add")
    public String add(User user){
        this.userService.add(user);
        return "suc";
    }
}
