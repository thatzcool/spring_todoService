package com.ssg.todoservice.mapper;

import com.ssg.todoservice.domain.TodoVO;

import java.util.List;

public interface TodoMapper {
    void insert(TodoVO todoVO);
    List<TodoVO> selectAll();
    TodoVO selectOne(Long tno);
}
