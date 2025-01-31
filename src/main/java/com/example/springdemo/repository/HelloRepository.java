package com.example.springdemo.repository;

import com.example.springdemo.dto.UserDto;

public interface HelloRepository {
    String fetchData();
    UserDto saveUser(UserDto user);
    UserDto findUserByName(String name);
}
