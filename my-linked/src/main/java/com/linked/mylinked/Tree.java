package com.linked.mylinked;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUNLLM
 * @description
 * @date 2021/7/13
 */
public class Tree {

    public List<Tree> list = new ArrayList<>();

    private Tree left;

    private Tree right;

    private Tree root;

    private String data;

    public Tree getRoot() {
        return root;
    }

    public void setRoot(Tree root) {
        this.root = root;
    }

    public Tree(String data){
        this.data = data;
    }

    public Tree(){}

    public void addData(int num){
        for (int i = 0; i <num ; i++) {
            list.add(new Tree(i+"节点"));
        }
    }

    public void addTree(){
        root = list.get(0);
        if(list!=null){
            for (int i = 0; i <list.size()/2 ; i++) {
                list.get(i).left = list.get(2*i+1);
                if(2*i+2<list.size()) {
                    list.get(i).right = list.get(2 * i + 2);
                }
            }
        }
    }


    // 前序遍历
    public void printTree(Tree root){
         if(root!=null){
             System.out.println(root.data);
             printTree(root.left);
             printTree(root.right);
         }
    }

    public void middlePrint(Tree root){
        if(root!=null){
            middlePrint(root.left);
            System.out.println(root.data);
            middlePrint(root.right);
        }
    }


}

