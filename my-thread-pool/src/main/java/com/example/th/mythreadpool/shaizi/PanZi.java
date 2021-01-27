package com.example.th.mythreadpool.shaizi;

import java.util.*;

/**
 * @author SUNLLM
 * @description 用来放骰子和计算两次出现相同骰子
 * @date 2021/1/27
 */
public class PanZi {

    // 用来统计摇出来的数字
    List<Integer> nums = new ArrayList<>();
    // 记录两次摇出来的相同数字
    Set<Integer> sameNums = new HashSet<>();
    // 当前摇到的数字
    private int num = 0;

    public boolean flag = false;

    public synchronized void Action(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notify();
        Random random = new Random();
        num = random.nextInt(6)+1;
        nums.add(num);
        System.out.println("摇到数字: "+num);
        if(nums.size()>1) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void compareNum(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        for(int j=0;j<nums.size()-1;j++){
            if(num==nums.get(j)){
                sameNums.add(num);
            }
        }

        if(sameNums.size()>=3){
            System.out.println("满足条件，退出线程");
            System.out.println("相同数字："+sameNums);
            System.out.println("全部数字："+nums);
            try {
                Thread.currentThread().interrupt();
            } catch ( Exception e) {
                e.printStackTrace();
            }

            //  线程被中断之后判断是否被中断，然后设置标志位，让前面的run()结束
            //  直接interrupt()不行，不会立刻停止
            if(Thread.currentThread().isInterrupted()){
                 flag = true;
            }
        }

        try {
            this.wait();
        } catch (InterruptedException e) {

        }


    }

}
