package com.github.dylanz666.controller;

import com.github.dylanz666.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author : dylanz
 * @since : 09/27/2020
 */
@RestController
public class AsyncTaskController {
    @Autowired
    private AsyncTaskService asyncTaskService;

    @GetMapping("/async/task")
    @ResponseBody
    public String execute() throws InterruptedException {
        long startTimeStamp = System.currentTimeMillis();
        asyncTaskService.asyncTask1();
        asyncTaskService.asyncTask2();
        asyncTaskService.asyncTask3();
        long endTimeStamp = System.currentTimeMillis();
        String message = "async tasks are triggered successfully, duration: " + (endTimeStamp - startTimeStamp) + " ms";
        System.out.println(message);
        return message;
    }
}
