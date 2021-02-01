package com.example.th.mythreadpool.wait;

public class MainThread {

    public static void main(String[] args) {
        action();
    }

    public static void action(){
        CommonClass commonClass = new CommonClass();

            Runnable a = new PrivadeThread("线程A", commonClass);
            Runnable b = new PrivadeThread("线程B", commonClass);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.start();
            t2.start();

    }
}
