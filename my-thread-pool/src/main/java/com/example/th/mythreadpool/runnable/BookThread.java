package com.example.th.mythreadpool.runnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/6/29
 * @return
 **/
public class BookThread implements Runnable{

    private String name;


    int book = 10;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {


            while (book > 1) {
                synchronized (this) {
                    System.out.println("线程" + Thread.currentThread().getName() + "拿到锁");
                    Thread.yield();
                    try {
                        Thread.sleep(1000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程" + Thread.currentThread().getName() + "买了书剩余书===" + book--);
                }

            }

    }
}
