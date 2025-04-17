package com.ssg.todoservice.service;

import com.ssg.todoservice.dto.TodoDTO;

import java.time.LocalDate;

public interface TodoService {
     void register(TodoDTO todoDTO);
}
