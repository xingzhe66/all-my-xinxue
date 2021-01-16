package com.example.th.mythreadpool.tongXun;

public class ConsumeBook implements Runnable {


    private ShuJia shujia;

    private Book book;

    public ConsumeBook (ShuJia shujia,Book book){
        this.book = book;
        this.shujia = shujia;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.shujia.read(this.book);
        }
    }
}
