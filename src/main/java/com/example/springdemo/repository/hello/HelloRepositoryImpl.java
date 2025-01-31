package com.example.springdemo.repository.hello;

import com.example.springdemo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class HelloRepositoryImpl implements HelloRepository{
    private final Map<String, UserDto> userData = new HashMap<>();

    @Override
    public String fetchData() {
        return "hello, world!";
    }

    @Override
    public UserDto saveUser(UserDto user) {
        userData.put(user.getName(), user);
        return user;
    }

    @Override
    public UserDto findUserByName(String name) {
        return userData.get(name);
    }
}
