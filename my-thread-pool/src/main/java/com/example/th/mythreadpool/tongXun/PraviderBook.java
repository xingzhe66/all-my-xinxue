package com.example.th.mythreadpool.tongXun;

public class PraviderBook implements Runnable {


    private ShuJia shujia;

    private Book book;

    public PraviderBook(ShuJia shujia, Book book) {
        this.shujia = shujia;
        this.book = book;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.shujia.pay(this.book);
        }

    }
}
