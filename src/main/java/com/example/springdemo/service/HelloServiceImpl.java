package com.example.springdemo.service;

import com.example.springdemo.dto.UserDto;
import com.example.springdemo.repository.HelloRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    private final HelloRepository helloRepository;

    public HelloServiceImpl(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String getHelloMessage() {
        return helloRepository.fetchData();
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        return helloRepository.saveUser(userDto);
    }

    @Override
    public UserDto findUserByName(String name) {
        return helloRepository.findUserByName(name);
    }
}
