package com.example.springdemo.service.todo;

import com.example.springdemo.dto.TodoDetailDto;
import com.example.springdemo.dto.request.CreateTodoRequest;
import com.example.springdemo.dto.response.CreateTodoResponse;
import com.example.springdemo.dto.response.GetTodoListResponse;

public interface TodoService {
    CreateTodoResponse createTodo(CreateTodoRequest createTodoRequest);
    GetTodoListResponse getTodoList();
    TodoDetailDto findTodoDetail(Long id);
}
