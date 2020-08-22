package com.org.proxy.myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author sunlonglong
 * 10:23
 * 境由心生,事在人为
 */
public class MainClass {

    public static void main(String[] args) {

        IPerson p = new PersonImpl("龙先生");

        // 创建一个和需要代理的对象关联的对象
        InvocationHandler handler = new ProxyHandle<IPerson>(p);
        // 创建一个对象去执行方法，代理对象执行的方法都会执行invoke()中的方法
        IPerson p1 = (IPerson) Proxy.newProxyInstance(IPerson.class.getClassLoader(),
                new Class<?> []{IPerson.class},handler);
        // 代理执行eat方法。
        p1.eat("大碗宽面");
    }
}
