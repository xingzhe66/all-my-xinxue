package com.example.th.mythreadpool.pool;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SUNLLM
 * @description
 * @date 2021/6/30
 */
public class BookThread implements Runnable{


    private String name;
    public BookThread(String name){
        this.name = name;
    }
    int book = 20;
    Lock lock  = new ReentrantLock();
    @Override
    public void run() {

        while(book>0){
            lock.lock();
            System.out.println("剩余数量大于0才可以购买");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(book>0) {
                System.out.println(this.name + "拿到线程开始执行，book==" + book--);
            }else{
                System.out.println("没有书了");
            }
            System.out.println("释放锁之前=="+lock.tryLock());
            lock.unlock();
            System.out.println("释放锁之后=="+lock.tryLock());
        }

    }
}
