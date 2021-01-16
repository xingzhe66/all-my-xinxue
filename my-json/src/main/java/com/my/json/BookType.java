package com.my.json;

import java.io.Serializable;
import java.math.BigDecimal;

public class BookType implements Serializable {
    private static final long serialVersionUID = 3413431434124314L;

    private String name;

    private String type;

    private BigDecimal price;

    public BookType(){}

    public BookType(String name,String type,BigDecimal price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
