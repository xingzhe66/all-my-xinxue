package com.provider.my.bs;

import com.provider.my.dao.MyDaoSupport;
import com.provider.my.po.UserInfo;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlonglong
 * 22:25
 * 境由心生,事在人为
 */

@Component
public class InforService {

    // redisTemplate 是SpringDataRedis提供的一个模板类，是对jedis的一个进一步的包装和改进
    // 当然这也是当下比较流行的一种对redis的操作方式
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private MyDaoSupport myDaoSupport;

    public List<UserInfo> getInfo(UserInfo u){
        // myDaoSupport.insert(u);
        List<UserInfo> list = new ArrayList<>();
        // 保证操作的值是正常显示，而不是序列化的值
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        long begain = System.currentTimeMillis();
        UserInfo info = (UserInfo)redisTemplate.boundValueOps("user").get();
        long end = System.currentTimeMillis();
        if(null!=info){
            long total = (end-begain);
            list.add(info);
            System.out.println("===========进入缓存，从缓存中取数据");
            System.out.println("耗时:"+ total);
        }else{
            long begain2 = System.currentTimeMillis();
            System.out.println("===========没有进入缓存，从数据库中取数据");
            list = myDaoSupport.selectAll(u);
            long end2 = System.currentTimeMillis();
            long total = (end2-begain2);
            System.out.println("耗时："+total);
            redisTemplate.boundValueOps("user").set(list.get(0));
        }
         return list;
    }
}
