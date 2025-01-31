package com.example.springdemo.dto.response;

import com.example.springdemo.dto.GetTodoListDto;

import java.util.List;

public record GetTodoListResponse(
        List<GetTodoListDto> todoList
) {
}
