package com.example.springdemo.repository.todo;

import com.example.springdemo.domain.Todo;

public interface TodoRepository {
    Todo save(Todo todo);
}
