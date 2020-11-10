package com.my.tree.mytree;

import lombok.Data;

import java.util.List;

@Data
public class SimpleTree {

    // 注意数据类型
    public SimpleTree left;

    public SimpleTree right;

    public Integer data;

    List<SimpleTree> listDate;

    public SimpleTree(SimpleTree left,SimpleTree right,Integer data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    // 这个构造方法用于给节点设置值，但是没有给左右节点设置值
    public SimpleTree(Integer data){
        this(null,null,data);
    }

    public SimpleTree(){

    }


}
