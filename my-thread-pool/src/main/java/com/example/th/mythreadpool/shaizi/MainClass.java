package com.example.th.mythreadpool.shaizi;

/**
 * @author SUNLLM
 * @description  两个线程摇骰子，当两次出现的数字一样时停止两个线程
 * @date 2021/1/27
 */
public class MainClass {

    public static void main(String[] args) {


            PanZi panZi = new PanZi();
            new Thread(new ThreadA(panZi)).start();
            new Thread(new ThreadB(panZi)).start();

    }
}
