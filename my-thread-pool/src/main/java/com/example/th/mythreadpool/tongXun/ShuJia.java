package com.example.th.mythreadpool.tongXun;

import java.util.ArrayList;
import java.util.List;

public class ShuJia {
    // 买书的数量
    List<Book> lists = new ArrayList<>();

    // 读书
    public synchronized void read(Book book){
        // 没有书了，等待
        if(lists.size()==0){
            notify();
            try {
                // 一旦等待后续代码不再执行，所以notity()在前面
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("读了=="+lists.size()+"次"+book.getName());
        lists.remove(book);

    }

    // 买书
    public synchronized void pay(Book book){


        // 书架大于5本就停止买
        if(lists.size()>5){
            notify();
            try {
                // 一旦等待后续代码不再执行，所以notity()在前面
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        lists.add(book);
        System.out.println("买了=="+ lists.size()+"次"+book.getName());


    }
}
