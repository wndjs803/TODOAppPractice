package com.example.springdemo.controller;

import com.example.springdemo.dto.UserDto;
import com.example.springdemo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/world")
    public String hello() {
        return helloService.getHelloMessage();
    }

    // UserDto: user name, user age
    @PostMapping("/user")
    public String saveUser(@RequestBody UserDto user) {
        // TODO: Implement saveName,
        // Repository 구현, name key, UserDto value hashmap에 저장
        UserDto userDto = helloService.saveUser(user);
        return userDto.getName();
    }

    @GetMapping("/user/{name}")
    public UserDto getUserByName(@PathVariable String name) {
        // TODO: Implement getUserByName
        return helloService.findUserByName(name);
    }
}
