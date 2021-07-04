package test1;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/6/2
 * @return
 **/
public class MainClas {
    public static void main(String[] args) {
        Book b = new Book("葵花宝鉴");

        System.out.println("origal:"+b.hashCode()+"=="+b.toString());

        Book clone = b.clone();
        System.out.println("clone:"+clone.hashCode()+"=="+clone.toString());


    }
}





