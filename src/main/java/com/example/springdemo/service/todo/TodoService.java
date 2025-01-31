package com.example.springdemo.service.todo;

import com.example.springdemo.dto.request.CreateTodoRequest;
import com.example.springdemo.dto.response.CreateTodoResponse;

public interface TodoService {
    CreateTodoResponse createTodo(CreateTodoRequest createTodoRequest);
}
