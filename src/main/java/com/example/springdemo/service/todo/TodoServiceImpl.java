package com.example.springdemo.service.todo;

import com.example.springdemo.domain.Todo;
import com.example.springdemo.dto.request.CreateTodoRequest;
import com.example.springdemo.dto.response.CreateTodoResponse;
import com.example.springdemo.mapper.TodoMapper;
import com.example.springdemo.repository.todo.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
    private final TodoMapper todoMapper;

    public TodoServiceImpl(TodoRepository todoRepository, TodoMapper todoMapper) {
        this.todoRepository = todoRepository;
        this.todoMapper = todoMapper;
    }

    @Override
    public CreateTodoResponse createTodo(CreateTodoRequest createTodoRequest) {
        Todo todo = todoMapper.toEntity(createTodoRequest);
        todoRepository.save(todo);
        return todoMapper.toCreatedTodoResponse(true);
    }
}
