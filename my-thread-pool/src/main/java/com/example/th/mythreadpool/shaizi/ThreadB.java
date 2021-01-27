package com.example.th.mythreadpool.shaizi;

/**
 * @author SUNLLM
 * @description
 * @date 2021/1/27
 */
public class ThreadB implements Runnable {


    private PanZi panzi;

    private boolean flag;

    public ThreadB(PanZi panzi){
        this.panzi = panzi;
    }
    @Override
    public void run() {

        while(true){
            panzi.compareNum();
            if(panzi.flag){
                break;
            }

        }
    }
}
