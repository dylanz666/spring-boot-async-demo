package com.github.dylanz666.service;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author : dylanz
 * @since : 09/27/2020
 */
@Service
public class SyncTaskService {
    public void syncTask1() throws InterruptedException {
        Thread.sleep(2000);//模拟阻塞操作
        System.out.println(new Date() + ": syncTask1 complete.");
    }

    public void syncTask2() throws InterruptedException {
        Thread.sleep(2000);//模拟阻塞操作
        System.out.println(new Date() + ": syncTask2 complete.");
    }

    public void syncTask3() throws InterruptedException {
        Thread.sleep(2000);//模拟阻塞操作
        System.out.println(new Date() + ": syncTask3 complete.");
    }
}
