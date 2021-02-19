package com.my.redis.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/2/1
 * @return
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataRedis {

    Logger log = LoggerFactory.getLogger(SpringDataRedis.class);

    // springDataRedis是在jedis之上的一种对redis操作的工具类，
    // 包装更加完整，也是当前比较流行的一种使用方式
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis(){

        System.out.println("测试Spring Data Redis 开始：");
        System.out.println("=============set 类型的操作====================");
        redisTemplate.boundSetOps("set").add("周杰伦");
        redisTemplate.boundSetOps("set").add("刘德华");
        redisTemplate.boundSetOps("set").add("赛迪范儿");
        System.out.println("set类型值输出："+redisTemplate.boundSetOps("set").members());
        System.out.println("set类型值删除："+redisTemplate.delete("set"));
        System.out.println("set类型删除后："+redisTemplate.boundSetOps("set").members());

        System.out.println("=============String 类型的操作====================");
        redisTemplate.boundValueOps("String").set("三国演义");
        System.out.println("String 类型值输出："+ redisTemplate.boundValueOps("String").get());
        System.out.println("String 类型值删除："+redisTemplate.delete("String"));
        System.out.println("String 类型值删除后取值："+redisTemplate.boundValueOps("String").get());

        System.out.println("=============List 类型的操作====================");
        redisTemplate.boundListOps("List").leftPush("香奈儿");
        redisTemplate.boundListOps("List").leftPush("酷奇");
        redisTemplate.boundListOps("List").leftPush("阿玛尼");
        System.out.println("List类型值输出："+redisTemplate.boundListOps("List").range(0,3));
        System.out.println("List类型值删除："+redisTemplate.delete("List"));
        System.out.println("List类型值删除后查询："+redisTemplate.boundListOps("List").range(0,0));

    }
}
