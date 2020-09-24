package com.github.dylanz666.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : dylanz
 * @since : 09/24/2020
 */
@RestController
public class TaskController {
    @GetMapping("/task")
    @ResponseBody
    public String execute() {
        return "success";
    }
}
