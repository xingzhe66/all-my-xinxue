package com.example.lam.mylambda.listToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sunlonglong
 * 8:35
 * 境由心生,事在人为
 */
public class MainClass2 {
    public static void main(String[] args) {

        // 1. list 转map
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("红富士",12));
        list.add(new Apple("果子狸",12));
        list.add(new Apple("香蕉",13));
        list.add(new Apple("荔枝",13));
        list.add(new Apple("桃子",14));
        list.add(new Apple("西瓜",14));
        list.add(new Apple("板栗",15));
        list.add(new Apple("红薯",16));
        // 下面的两种写法含义是一样的，第一个参数是拿到key值，第二个表示拿到对象本身
//        Map<Integer, Apple> collect1 = list.stream().collect(Collectors.toMap(Apple::getNum, a -> a));
//        Map<Integer, Apple> collect2 = list.stream().collect(Collectors.toMap(Apple::getNum, Function.identity()));
//        // di三种写法，最后一个参数是为了防重，如果两者一样取其中之一
//        Map<Integer, Apple> collect3 = list.stream().collect(Collectors.toMap(Apple::getNum, a -> a, (t1, t2) -> t1));
//
//        System.out.println(collect2);


    }
}
