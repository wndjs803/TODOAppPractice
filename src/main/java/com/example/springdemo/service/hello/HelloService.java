package com.example.springdemo.service.hello;

import com.example.springdemo.dto.UserDto;

public interface HelloService {
    String getHelloMessage();
    UserDto saveUser(UserDto userDto);
    UserDto findUserByName(String name);
}
