package com.ssg.todoservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDTO {
    private Long tno;
    private String title;
    private String writer;
    private LocalDate dueDate;
    private boolean finished;
}
