package com.socket.test.demo;

import java.net.InetAddress;
import java.net.Socket;

/**
 * @author sunlonglong
 * 22:29
 * 境由心生,事在人为
 */
public class AddressInte {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.baidu.com");

        System.out.println("IP： " + address.getHostAddress());
        System.out.println("域名： " + address.getHostName());
        System.out.println(InetAddress.getLocalHost());
    }
}
