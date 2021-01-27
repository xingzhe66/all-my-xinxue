package com.example.th.mythreadpool.saleEggThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUNLLM
 * @description
 * @date 2021/1/26
 */
public class Lanzi {

    private List<Egg> list = new ArrayList<>();

    public synchronized void putEgg(Egg egg){
        if(list.size()>5){
            notify();
            try {
               wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(egg);
        System.out.println("篮子中放了一个鸡蛋[{}]"+"编号为："+list.size());

    }

    public synchronized void delEgg(Egg egg){
        if(list.size()==0){
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.remove(egg);
        System.out.println("篮子中取走一个鸡蛋：[{}]"+"编号为："+list.size());
    }
}
