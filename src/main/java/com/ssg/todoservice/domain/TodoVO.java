package com.ssg.todoservice.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
    private Long tno;
    private String title;
    private String writer;
    private LocalDate dueDate;
    private boolean finished;


}
