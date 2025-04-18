package com.ssg.todoservice.service;


import com.ssg.todoservice.domain.TodoVO;
import com.ssg.todoservice.dto.TodoDTO;
import com.ssg.todoservice.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    // 스프링컨테이너가 관리하는 빈을 주입 , DTO, VO 변환 작업 서비스 제공

    private final TodoMapper todoMapper;
    private final ModelMapper modelMapper;


    @Override
    public void register(TodoDTO todoDTO) {

        log.info("register model Mapper injection");
        TodoVO vo = modelMapper.map(todoDTO, TodoVO.class);
        log.info(vo);
        todoMapper.insert(vo);

    }

    @Override
    public List<TodoDTO> getListAll() {
             List<TodoDTO> dtoList = todoMapper.selectAll().stream().map(vo ->modelMapper.map(vo, TodoDTO.class)).collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public TodoDTO getTodoOne(Long tno) {

        TodoVO todoVO = todoMapper.selectOne(tno);
        TodoDTO     todoDTO = modelMapper.map(todoVO, TodoDTO.class);
        return todoDTO;
    }

    @Override
    public void remove(Long tno) {
       todoMapper.delete(tno);
    }

    @Override
    public void modify(TodoDTO todoDTO) {
          todoMapper.update(todoDTO);
    }
}
