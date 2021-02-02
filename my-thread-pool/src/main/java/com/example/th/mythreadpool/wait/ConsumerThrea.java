package com.example.th.mythreadpool.wait;

public class ConsumerThrea implements Runnable {

    private CommonClass cs;

    private String name;

    public ConsumerThrea() {
    }

    public ConsumerThrea(String name, CommonClass cs) {
        this.cs = cs;
        this.name = name;
    }

    @Override
    public void run() {

        for (int a = 0; a < 30; a++) {
            synchronized (cs) {
                notify();
                for (int i = 0; i < 5; i++) {
                    System.out.println(this.name + "消费者执行==" + cs.num--);
                }
                try {
                    cs.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
