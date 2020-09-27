package com.github.dylanz666.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author : dylanz
 * @since : 09/27/2020
 */
@Service
public class AsyncTaskService {
    @Async
    public void asyncTask1() throws InterruptedException {
        Thread.sleep(2000);//模拟阻塞操作
        System.out.println(new Date() + ": asyncTask1 complete.");
    }

    @Async
    public void asyncTask2() throws InterruptedException {
        Thread.sleep(2000);//模拟阻塞操作
        System.out.println(new Date() + ": asyncTask2 complete.");
    }

    @Async
    public void asyncTask3() throws InterruptedException {
        Thread.sleep(2000);//模拟阻塞操作
        System.out.println(new Date() + ": asyncTask3 complete.");
    }
}
