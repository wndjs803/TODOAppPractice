package com.example.springdemo.repository.todo;

import com.example.springdemo.domain.Todo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TodoRepositoryImpl implements TodoRepository {
    private final Map<Long, Todo> data = new HashMap<>();

    public TodoRepositoryImpl() {
    }

    @Override
    public Todo save(Todo todo) {
        return data.put(todo.getId(), todo);
    }

    @Override
    public List<Todo> findAll() {
        return List.copyOf(data.values());
    }

    @Override
    public Todo findById(Long id) {
        return data.get(id);
    }
}
