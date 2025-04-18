package com.ssg.todoservice.service;

import com.ssg.todoservice.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;

public interface TodoService {
     void register(TodoDTO todoDTO);
     List<TodoDTO> getListAll();
     TodoDTO getTodoOne(Long tno);
     void remove(Long tno);
     void modify(TodoDTO todoDTO);
}
