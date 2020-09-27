package com.github.dylanz666.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.concurrent.Future;

/**
 * @author : dylanz
 * @since : 09/27/2020
 */
@Service
@Async
public class AsyncTaskService2 {
    public Future<String> asyncTask1() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(new Date() + ": asyncTask1 complete");
        return new AsyncResult<String>("asyncTask1 complete");
    }

    public Future<String> asyncTask2() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(new Date() + ": asyncTask1 complete");
        return new AsyncResult<String>("asyncTask1 complete");
    }

    public Future<String> asyncTask3() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(new Date() + ": asyncTask1 complete");
        return new AsyncResult<String>("asyncTask1 complete");
    }
}
