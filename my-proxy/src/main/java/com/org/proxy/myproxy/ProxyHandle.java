package com.org.proxy.myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sunlonglong
 * 10:35
 * 境由心生,事在人为
 */
public class ProxyHandle<T> implements InvocationHandler {

    T target;

    // 记录时间
    ThreadLocal<Long> local = new ThreadLocal<>();

    public ProxyHandle(T target){
        this.target = target;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        local.set(System.currentTimeMillis());
        System.out.println("代理执行：" + method.getName());
        System.out.println("执行一些前置处理，比如准备食材，炒菜等操作");
        Object result = method.invoke(target,args);
        System.out.println("输出参数：" + (String)args[0]);
        System.out.println("吃饭结束；总共花费：" + (System.currentTimeMillis() - local.get()) + "ms");
        return result;
    }
}
