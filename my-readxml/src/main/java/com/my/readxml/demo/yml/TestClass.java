package com.my.readxml.demo.yml;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sunlonglong
 * 21:20
 * 境由心生,事在人为
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClass {

    @Autowired
    private My my;

    @Test
    public void myTest() throws  Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("年龄为："+ my.getAge());
        System.out.println("姓名为："+ my.getName());
        System.out.println("爱好为："+  my.getHobby());
        System.out.println("工作为："+ my.getJob());
    }
}
