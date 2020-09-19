package com.org.proxy.myproxy.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author sunlonglong
 * 20:51
 * 境由心生,事在人为
 */
public class MainClass2 {

    public static void main(String[] args) {
        // 创建一个对象
        BookImpl book = new BookImpl();
        // 建立对象和代理类的关系
        InvocationHandler hander = new ProxyAction<IBook>(book);
        // 拿到代理对象
        IBook o = (IBook)Proxy.newProxyInstance(BookImpl.class.getClassLoader(),
                BookImpl.class.getInterfaces(), hander);

        // 执行方法
        o.buy("大圣");
        // 代理结束之后执行一些后置方法
        System.out.println("买完书，然后把书带回去");
    }
}
