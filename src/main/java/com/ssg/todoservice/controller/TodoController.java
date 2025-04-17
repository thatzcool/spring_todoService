package com.ssg.todoservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo Regiter");
    }

}
