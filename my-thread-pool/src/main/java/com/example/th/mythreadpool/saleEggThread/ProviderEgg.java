package com.example.th.mythreadpool.saleEggThread;

import java.util.List;

/**
 * @author SUNLLM
 * @description
 * @date 2021/1/26
 */
public class ProviderEgg implements Runnable {


private Lanzi lanzi;
    private Egg egg;

    public ProviderEgg (Lanzi lanzi, Egg egg){
        this.egg= egg;
        this.lanzi= lanzi;

    }

    private int a =0;
    @Override
    public void run() {
        while(true) {

           lanzi.putEgg(this.egg);
        }
    }
}
