package com.example.th.mythreadpool.saleEggThread;

import java.util.List;

/**
 * @author SUNLLM
 * @description
 * @date 2021/1/26
 */
public class ConsumeEgg implements Runnable {

    private Egg egg;

    private Lanzi lanzi;

    public ConsumeEgg( Lanzi lanzi,Egg egg){
        this.egg = egg;
        this.lanzi= lanzi;

    }

    @Override
    public void run() {
        while(true){

            this.lanzi.delEgg(this.egg);
        }
    }
}
