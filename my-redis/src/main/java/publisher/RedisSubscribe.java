package publisher;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/2/6
 * @return  消息订阅者
 **/
public class RedisSubscribe extends JedisPubSub {


    // 订阅者需要继承 JedisPubSub 这个类，并且重写onMessage
    // 一旦受到消息会自动回调该方法
    @Override
    public void onMessage(String channel, String message) {
        System.out.println("经验证，此方法不需要重启，直接修改就可以使用，那就是在回调时会重新加载");
        System.out.println("订阅者收到消息，频道为："+ channel+",消息内容为："+message);
    }

    public static void main(String[] args) {

        System.out.println("已经订阅了消息，等待接收。。。。。");
        Jedis jedis = new Jedis("192.168.136.6", 6380);
        jedis.auth("sun");
        // 创建订阅者对象
        RedisSubscribe redisSubscribe = new RedisSubscribe();

        jedis.subscribe(redisSubscribe,"A186");
    }
}
