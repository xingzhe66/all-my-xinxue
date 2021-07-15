package com.my.tree.mytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUNLLM
 * @description
 * @date 2021/7/9
 */
public class Tree {

    private Tree left;

    private Tree right;

    private int data;

    public Tree(Tree left,Tree right,int data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Tree(int data){
        this.data = data;
    }

    public List<Tree> addData(){
        List<Tree> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Tree tree = new Tree(i);
            list.add(tree);
        }
        return list;
    }

    public void generateTree(List<Tree> list){
        for (int i = 0; i <list.size() ; i++) {
            list.get(i).left = list.get(2*i+1);
            list.get(i).right = list.get(2*i+2);
        }
    }


}
