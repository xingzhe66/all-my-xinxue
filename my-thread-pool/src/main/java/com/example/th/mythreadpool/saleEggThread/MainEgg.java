package com.example.th.mythreadpool.saleEggThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUNLLM
 * @description
 * @date 2021/1/26
 */
public class MainEgg {

    public static void main(String[] args) {
        Egg egg = new Egg();
        Lanzi lanzi = new Lanzi();
        new Thread(new ProviderEgg(lanzi,egg)).start();
        new Thread(new ConsumeEgg(lanzi,egg)).start();
    }
}
