package com.example.springdemo.mapper;

import com.example.springdemo.domain.Todo;
import com.example.springdemo.dto.request.CreateTodoRequest;
import com.example.springdemo.dto.response.CreateTodoResponse;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {
    public Todo toEntity(CreateTodoRequest createTodoRequest) {
        return new Todo(createTodoRequest.title(), createTodoRequest.description());
    }

    public CreateTodoResponse toCreatedTodoResponse(boolean success) {
        return new CreateTodoResponse(success);
    }
}
