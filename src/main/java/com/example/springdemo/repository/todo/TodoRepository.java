package com.example.springdemo.repository.todo;

import com.example.springdemo.domain.Todo;

import java.util.List;

public interface TodoRepository {
    Todo save(Todo todo);
    List<Todo> findAll();
}
