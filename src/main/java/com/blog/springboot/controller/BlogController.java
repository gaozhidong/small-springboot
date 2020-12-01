package com.blog.springboot.controller;

import com.blog.springboot.service.AuthService;
import com.blog.springboot.service.BlogService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class BlogController {
    private final AuthService authService;
    private final BlogService blogService;

    @Inject
    public BlogController(AuthService authService, BlogService blogService) {
        this.authService = authService;
        this.blogService = blogService;
    }
}
