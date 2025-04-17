package com.ssg.todoservice.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TodoDTO {
    private Long tno;
    @NotEmpty
    private String title;
    @NotEmpty
    private String writer;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private LocalDate dueDate;
    private boolean finished;
}
