package com.org.proxy.myproxy.proxy2;

/**
 * @author sunlonglong
 * 20:48
 * 境由心生,事在人为
 */
public class BookImpl implements IBook {

    @Override
    public void buy(String name) {
        System.out.println(name + " 需要买一本书");
    }
}
