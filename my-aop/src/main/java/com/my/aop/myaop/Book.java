package com.my.aop.myaop;

import org.springframework.stereotype.Component;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/4
 * @return
 **/
@Component
public class Book {

    public String sealBook(){
        System.out.println("开始卖书了");
        return "葵花宝典";
    }
}
