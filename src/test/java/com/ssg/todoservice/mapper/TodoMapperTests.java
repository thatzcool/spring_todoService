package com.ssg.todoservice.mapper;


import com.ssg.todoservice.domain.TodoVO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TodoMapperTests {
    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testInsert() {
         TodoVO todoVO = TodoVO.builder()
                 .title("스프링 Todo Service")
                 .dueDate(LocalDate.of(2025,01,01))
                 .writer("sym")
                 .build();
         todoMapper.insert(todoVO);

    }
}
