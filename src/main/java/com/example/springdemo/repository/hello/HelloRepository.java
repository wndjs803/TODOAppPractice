package com.example.springdemo.repository.hello;

import com.example.springdemo.dto.UserDto;

public interface HelloRepository {
    String fetchData();
    UserDto saveUser(UserDto user);
    UserDto findUserByName(String name);
}
