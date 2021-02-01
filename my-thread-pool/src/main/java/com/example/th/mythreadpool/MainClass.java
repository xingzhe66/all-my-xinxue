package com.example.th.mythreadpool;

import com.example.th.mythreadpool.pool.ThreadPool;
import com.example.th.mythreadpool.runnable.TicketThread;

/**
 * @author sir
 * 14:43
 * 境由心生,事在人为
 */
public class MainClass {
    public static void main(String[] args) {

        // 1.开始执行线程池，开启了多个线程任务，多个线程执行
         new ThreadPool().action();
        // 2.卖票任务，这个和线程池不一样，这个是一个任务，多个线程去执行
//        TicketThread th = new TicketThread();
//        new Thread(th,"小李").start();
//        new Thread(th,"小王").start();
//        new Thread(th,"小黑").start();
//        new Thread(th,"小红").start();
//        new Thread(th,"小丫头").start();
//        Thread a = new ThreadA("线程A");
//        Thread b = new ThreadB("线程B");
//        a.start();
//        b.start();

    }

}
class MethodCommon{
    private String name;

    public MethodCommon(String name){
        this.name = name;
    }
    public void action(){
        System.out.println(this.name + "==执行");
    }
}
class ThreadA extends Thread{
    private String name;
    public ThreadA(String name){
        this.name = name;
    }
    MethodCommon m = new MethodCommon(this.name);
    @Override
    public void run() {
        m.action();
    }
}

class ThreadB extends Thread{

    private String name;
    public ThreadB(String name){
        this.name = name;
    }
    MethodCommon m = new MethodCommon(this.name);
    @Override
    public void run() {
        m.action();
    }
}
