package com.org.proxy.myproxy;

/**
 * @author sunlonglong
 * 10:24
 * 境由心生,事在人为
 */
public class PersonImpl implements IPerson{

    private String name;

    public PersonImpl(String name){
        this.name = name;
    }


    @Override
    public void eat(String type) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("中午到了，" + this.name + "该吃饭了" + "中午吃【" + type +"】");
    }
}
