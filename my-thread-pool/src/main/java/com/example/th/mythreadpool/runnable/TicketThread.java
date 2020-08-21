package com.example.th.mythreadpool.runnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sir
 * 16:01
 * 境由心生,事在人为
 */
public class TicketThread implements Runnable {

    private int ticket = 10;

    Lock lock = new ReentrantLock();


    @Override
    public void run() {


     while(true){
            lock.lock();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(this.ticket>0){
                System.out.println(Thread.currentThread().getName() + "--开始卖票，剩余：--" + (this.ticket--));
            }else{
                System.out.println("票没了");
                break;
            }
            lock.unlock();
        }

    }
}
