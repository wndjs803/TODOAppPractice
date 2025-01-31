package com.example.springdemo.domain;

import java.util.Random;

public class Todo {
    private final Long id;
    private String title;
    private String description;

    public Todo(String title, String description) {
        this.id = new Random().nextLong();
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }
}
