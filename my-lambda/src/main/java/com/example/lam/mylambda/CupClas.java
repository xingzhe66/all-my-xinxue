package com.example.lam.mylambda;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Comparator;

/**
 * @author sir
 * 22:25
 * 境由心生,事在人为
 */
@Data
public class CupClas{

    private String name;

    private int num;

    public CupClas(String name,int num){
        this.name = name;
        this.num = num;
    }

}
