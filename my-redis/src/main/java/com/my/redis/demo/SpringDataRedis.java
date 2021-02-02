package com.my.redis.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){

      log.debug("dfsafdasd========================================================= ");

        redisTemplate.boundValueOps("String").set("this is a test");
        System.out.println(redisTemplate.boundValueOps("String").get());

    }
}
