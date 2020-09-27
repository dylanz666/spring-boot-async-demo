package com.github.dylanz666.controller;

import com.github.dylanz666.service.AsyncTaskService;
import com.github.dylanz666.service.SyncTaskService;
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
public class SyncTaskController {
    @Autowired
    private SyncTaskService syncTaskService;

    @GetMapping("/sync/task")
    @ResponseBody
    public String execute() throws InterruptedException {
        long startTimeStamp = System.currentTimeMillis();
        syncTaskService.syncTask1();
        syncTaskService.syncTask2();
        syncTaskService.syncTask3();
        long endTimeStamp = System.currentTimeMillis();
        String message = "sync tasks are complete, duration: " + (endTimeStamp - startTimeStamp) + " ms";
        System.out.println(message);
        return message;
    }
}
