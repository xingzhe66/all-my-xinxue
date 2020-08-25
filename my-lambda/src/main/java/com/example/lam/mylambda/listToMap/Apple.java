package com.example.lam.mylambda.listToMap;

import lombok.Data;

/**
 * @author sunlonglong
 * 8:36
 * 境由心生,事在人为
 */
@Data
public class Apple {

    private String name;

    private Integer num;

    public Apple(String name, int num){
        this.name = name;
        this.num = num;
    }
}
