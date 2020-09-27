package com.github.dylanz666.controller;

import com.github.dylanz666.service.AsyncTaskService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.concurrent.Future;

/**
 * @author : dylanz
 * @since : 09/27/2020
 */
@RestController
@RequestMapping("/async/complex")
public class AsyncTaskController2 {
    @Autowired
    private AsyncTaskService2 asyncTaskService2;

    public static String status = "async tasks are not triggered.";
    public static Future<String> task1;
    public static Future<String> task2;
    public static Future<String> task3;

    @GetMapping("/task")
    @ResponseBody
    public String execute() throws InterruptedException {
        long startTimeStamp = System.currentTimeMillis();
        task1 = asyncTaskService2.asyncTask1();
        task2 = asyncTaskService2.asyncTask2();
        task3 = asyncTaskService2.asyncTask3();
        status = "";
        assert task1 != null;
        if (task1.isDone() && task2.isDone() && task3.isDone()) {
            status = "async tasks are done.";
        } else {
            status = "async tasks are doing.";
        }
        long endTimeStamp = System.currentTimeMillis();
        String message = "async tasks are triggered successfully, duration: " + (endTimeStamp - startTimeStamp) + " ms";
        System.out.println(message);
        return message;
    }

    @GetMapping("/task/status")
    @ResponseBody
    public String getTasksStatus() {
        return status;
    }

    @GetMapping("/task/status/{taskId}")
    @ResponseBody
    public Boolean getTaskStatus(@PathVariable(name = "taskId") int taskId) {
        boolean taskStatus = false;
        switch (taskId) {
            case 1:
                taskStatus = task1.isDone();
                break;
            case 2:
                taskStatus = task2.isDone();
                break;
            case 3:
                taskStatus = task3.isDone();
                break;
        }
        return taskStatus;
    }
}
