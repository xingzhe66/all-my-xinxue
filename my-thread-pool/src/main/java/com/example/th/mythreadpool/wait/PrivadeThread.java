package com.example.th.mythreadpool.wait;

public class PrivadeThread implements Runnable {

    private String name;

    private CommonClass cs;


    public PrivadeThread() {
    }

    public PrivadeThread(String name, CommonClass cs) {
        this.cs = cs;
        this.name = name;
    }

    @Override
    public void run() {

        for (int a = 0; a < 30; a++) {
            synchronized (this) {
                notifyAll();
                for (int i = 0; i < 5; i++) {
                    System.out.println(this.name + "生产者生产==" + cs.num++);
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
