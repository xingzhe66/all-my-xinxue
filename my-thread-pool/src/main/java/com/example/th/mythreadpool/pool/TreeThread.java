package com.example.th.mythreadpool.pool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sir
 * 14:47
 * 境由心生,事在人为
 */
public class TreeThread implements Runnable {

    private int num = 10;

    Lock lock = new ReentrantLock();

    private int threadNum;

    public TreeThread(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run(){

        System.out.println("第"+threadNum+"个线程开始种树");
        synchronized (new Object()) {
            while (num > 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 如果树还没有种完，一直循环种，但是一直是当前线程在操作
                System.out.println(Thread.currentThread().getName() + "--开始种树；剩余树苗：== " + (--num));

            }
        }

    }
}
