package com.example.springdemo.controller.todo;

import com.example.springdemo.dto.request.CreateTodoRequest;
import com.example.springdemo.dto.response.CreateTodoResponse;
import com.example.springdemo.service.todo.TodoService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todoList")
    public ResponseEntity<CreateTodoResponse> createTodo(@RequestBody CreateTodoRequest createTodoRequest) {
        return ResponseEntity.status(CREATED).body(todoService.createTodo(createTodoRequest));
    }
}
