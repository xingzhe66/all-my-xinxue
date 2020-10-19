package com.provider.my.testRedis;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author sunlonglong
 * 21:41
 * 境由心生,事在人为
 */
public class MainRedis {

    public static final String HOST = "192.168.130.0";

    public static final int PORT = 6379;

    public static void main(String[] args) {

        Jedis jedis = new Jedis(HOST, PORT);
        jedis.auth("sun");

        String ping = jedis.ping();
        System.out.println(ping);
        //  设置多个值
        jedis.mset("k1","1","k2","2","k3","3");
        System.out.println( jedis.mget("k1","k2","k3","k4"));
        jedis.set("s1","10");
        System.out.println(jedis.get("s1"));

        jedis.set("this is key".getBytes(),"this is value".getBytes());
        byte[] bytes = jedis.get("this is key".getBytes());
        System.out.println("bytes==:" + bytes);
        System.out.println("bytesToString==:" + new String(bytes));
        jedis.close();

    }
}
