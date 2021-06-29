package com.example.th.mythreadpool.runnable;

import com.example.th.mythreadpool.tongXun.Book;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/6/29
 * @return
 **/
public class BookMain {

    public static void main(String[] args) {


        // 一个线程任务，开启多个线程去执行
        BookThread b = new BookThread();

        Thread t = new Thread(b,"线程A");
        Thread t1 = new Thread(b,"线程B");
        Thread t2 = new Thread(b,"线程C");

        t1.setPriority(1);
        t1.start();
        t2.start();
        t2.setPriority(5);
        t.start();


    }
}
