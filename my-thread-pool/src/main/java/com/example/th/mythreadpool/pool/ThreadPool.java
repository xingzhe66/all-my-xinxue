package com.example.th.mythreadpool.pool;

import java.util.concurrent.*;

/**
 * @author sir
 * 14:52
 * 境由心生,事在人为
 */
public class ThreadPool {

    public void action(){
        // 设置等待队列
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(5);
        // 拒绝策略
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();

        ThreadPoolExecutor pool = new ThreadPoolExecutor(10,12,2, TimeUnit.SECONDS,queue,
              handler);

        pool.prestartAllCoreThreads();

        // 开启任务,开启十个需要执行的线程任务（每个都是种10颗树），放入线程池
        for (int i = 0; i < 10; i++) {

            TreeThread th = new TreeThread(i);
            pool.execute(th);
        }



    }
}
