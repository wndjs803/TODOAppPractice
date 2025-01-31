package com.example.springdemo.mapper;

import com.example.springdemo.domain.Todo;
import com.example.springdemo.dto.GetTodoListDto;
import com.example.springdemo.dto.TodoDetailDto;
import com.example.springdemo.dto.request.CreateTodoRequest;
import com.example.springdemo.dto.response.CreateTodoResponse;
import com.example.springdemo.dto.response.GetTodoListResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoMapper {
    public Todo toEntity(CreateTodoRequest createTodoRequest) {
        return new Todo(createTodoRequest.title(), createTodoRequest.description());
    }

    public CreateTodoResponse toCreatedTodoResponse(boolean success) {
        return new CreateTodoResponse(success);
    }

    public GetTodoListDto toGetTodoListDto(Todo todo) {
        return new GetTodoListDto(todo.getId(), todo.getTitle());
    }

    public GetTodoListResponse toGetTodoListResponse(List<Todo> todoList) {
        List<GetTodoListDto> todoDtoList = todoList.stream()
                .map(this::toGetTodoListDto)
                .toList();

        return new GetTodoListResponse(todoDtoList);
    }

    public TodoDetailDto toTodoDetailDto(Todo todo) {
        return new TodoDetailDto(todo.getTitle(), todo.getDescription());
    }
}
