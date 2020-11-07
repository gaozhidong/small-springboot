package com.blog.springboot.service;

import com.blog.springboot.eneity.User;
import com.blog.springboot.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
@Service
public class UserService {

    private UserMapper userMapper;

    @Inject
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(Integer id){
     return userMapper.findUserById(id);
    }
}