package com.my.aop.myaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/4
 * @return
 **/
@Aspect
@Component
public class AspectClass {

    // 运行发现环绕通知开支执行，然后执行前置通知

    @Before("execution(*  com.my.aop.myaop.Book.sealBook(..))")
    public void beforeAction(){
        System.out.println("前置开始执行");
    }

    @Around("execution(* com.my.aop.myaop.Book.sealBook(..))")
    public void AroundAction(ProceedingJoinPoint p){

        System.out.println("在执行之前环绕环绕");
        try {
            String str =(String) p.proceed();
            System.out.println("返回值："+str);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("在执行之后环绕环绕");

    }

}
