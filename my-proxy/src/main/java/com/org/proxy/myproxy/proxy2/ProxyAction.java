package com.org.proxy.myproxy.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sunlonglong
 * 20:49
 * 境由心生,事在人为
 */
public class ProxyAction<T> implements InvocationHandler {

    private T t;
    public ProxyAction(T t){
        this.t = t;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(t, args);
        return invoke;
    }
}
