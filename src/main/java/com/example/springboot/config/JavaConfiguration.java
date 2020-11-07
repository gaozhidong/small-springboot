package com.example.springboot.config;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.OrderService;
import com.example.springboot.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
    @Bean
    public UserService userService(UserMapper userMapper){
        return new UserService(userMapper);
    }
    @Bean
    public OrderService orderService(UserService userService){
        return new OrderService(userService);
    }

}
