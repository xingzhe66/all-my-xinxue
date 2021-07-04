package com.my.aop.myaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/4
 * @return
 **/
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Book bean = context.getBean(Book.class);
        bean.sealBook();
    }
}
