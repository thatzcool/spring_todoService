package com.ssg.todoservice.controller;

import com.ssg.todoservice.dto.TodoDTO;
import com.ssg.todoservice.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;


    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo Regiter");
    }

    // 간단한 메세지를 콘솔 출력하는 /todo/list getmapping 메소드를 작성해 주세요
    @GetMapping("/list")
    public void list(Model model) {
        log.info("GET list............");
        List<TodoDTO> dtoList = todoService.getListAll();
//        model.addAttribute("dtoList", todoService.getListAll());
        model.addAttribute("dtoList", dtoList);
    }

    //TodoController에서는 TodoDTO 로 바로 전달된 파라미터로 값들을 수집한다.
    @PostMapping("/register")
    public String registerPOST(@Valid TodoDTO todoDTO , BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("POST register...............");
        if (bindingResult.hasErrors()) {
            log.info("bindingResult.hasErrors() error");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/todo/register";
        }
        log.info(todoDTO);
        todoService.register(todoDTO);
        return "redirect:/todo/list";
    }
//    @GetMapping("/read")
//    public void readGET(Long tno, Model model) {
//        log.info("GET read..............");
//        TodoDTO dto = todoService.getTodoOne(tno);
//        log.info(dto);
//        model.addAttribute("dto", dto);
//    }

    @GetMapping({"/read", "/modify"})
    public void read(Long tno, Model model) {
        TodoDTO todoDTO = todoService.getTodoOne(tno);
        model.addAttribute("dto",todoDTO);

    }

    @PostMapping("/remove")
     public String remove(Long tno , RedirectAttributes redirectAttributes) {
        log.info("----------remove todo -----------");
        log.info(tno);
        todoService.remove(tno);
        return "redirect:/todo/list";
    }
}
