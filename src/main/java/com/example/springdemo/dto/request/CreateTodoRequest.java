package com.example.springdemo.dto.request;

public record CreateTodoRequest(
        String title,
        String description
) {}
