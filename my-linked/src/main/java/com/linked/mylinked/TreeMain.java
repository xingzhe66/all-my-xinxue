package com.linked.mylinked;

/**
 * @author SUNLLM
 * @description
 * @date 2021/7/13
 */
public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addData(10);
        tree.addTree();
        tree.printTree(tree.getRoot());
        System.out.println("中序遍历：");
        tree.middlePrint(tree.getRoot());
    }
}
