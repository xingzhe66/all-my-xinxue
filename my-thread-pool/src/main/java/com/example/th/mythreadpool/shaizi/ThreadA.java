package com.example.th.mythreadpool.shaizi;

/**
 * @author SUNLLM
 * @description
 * @date 2021/1/27
 */
public class ThreadA implements Runnable {

    private PanZi panzi;

    public ThreadA(PanZi panzi){
        this.panzi = panzi;
    }

    @Override
    public void run() {

        while (true) {
            panzi.Action();
            if(panzi.flag){
                break;
            }
        }

    }
}
