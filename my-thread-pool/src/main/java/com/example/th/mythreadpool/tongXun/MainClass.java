package com.example.th.mythreadpool.tongXun;

public class MainClass {

    public static void main(String[] args) {

        Book book = new Book("书");

        ShuJia shujai = new ShuJia();

        // 此处启动了两个线程，但是必须使用同一个ShuJia对象
        new Thread(new PraviderBook(shujai,book)).start();

        new Thread(new ConsumeBook(shujai,book)).start();


    }
}
