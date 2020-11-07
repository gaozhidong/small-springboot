package com.example.springboot;

import com.example.springboot.service.User;
import com.example.springboot.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

private UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public User index() {
       return this.userService.getUserById(1);
    }

}