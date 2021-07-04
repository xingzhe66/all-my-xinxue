package com.example.th.mythreadpool.threadlocal;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/4
 * @return
 **/
public class Person {

    // 保存属性值得副本，为每一个线程保存一份
    ThreadLocal<String> name = new ThreadLocal<>();


    public String getName(){
        return this.name.get();
    }

    public void setName(String name){
        this.name.set(name);
    }
}
