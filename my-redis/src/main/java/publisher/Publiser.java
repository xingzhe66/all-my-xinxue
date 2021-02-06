package publisher;

import redis.clients.jedis.Jedis;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/2/6
 * @return
 **/
public class Publiser {

    // 消息发送端，用来发送消息

    public static void main(String[] args) {


        Jedis jedis = new Jedis("192.168.136.6", 6380);
        jedis.auth("sun");

        // 发布消息
        jedis.publish("A186","请注意！请注意！！！");

        System.out.println("消息发送结束了");

    }
}
