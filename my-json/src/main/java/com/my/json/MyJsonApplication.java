package com.my.json;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import org.json.JSONWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonParser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyJsonApplication {

    private static final Logger log = LoggerFactory.getLogger(MyJsonApplication.class);

    // 序列化：将类或者对象序列化为二进制流，用于分布式远程调用传输
    // 反序列化：将二进制数据转为对象，
    // 用于数据库交互的类需要实现Serializable并serialVersionUID赋值，此值可以随意赋值（64位），
    // 不赋值会默认赋值，最好手动赋值
    public static void main(String[] args) {
        //SpringApplication.run(MyJsonApplication.class, args);

        List<BookType> typeList = new ArrayList<>();
        BookType bookType = new BookType("测试", "二类", new BigDecimal(12));
        BookType bookType1 = new BookType("测试1", "一类", new BigDecimal(2));
        BookType bookType2 = new BookType("测试2", "三类", new BigDecimal(72));
        typeList.add(bookType);
        typeList.add(bookType1);
        typeList.add(bookType2);
        log.debug("=====typeList=====[{}]",typeList);
        log.debug("=====bookType=====[{}]",bookType);
        Long lo = 121L;
        log.debug("=====lo=====[{}]", JSONUtils.toJSONString(lo));
        log.debug("=====typeList.get(0)=====[{}]",typeList.get(0).getName());
        // JSON.toJsonString() 对象不需要重写同String（）可以输出
        log.debug("=====typeList=====[{}]", JSON.toJSONString(typeList));
        log.debug("=====bookType2=====[{}]", JSON.toJSONString(bookType2));
        log.debug("=====bookType2=====[{}]", JSON.toJSON(bookType2));

           }

}
