package com.my.tree.mytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    //                       1                                  2^(1-1)=1
    //             2                     3                      2^(2-1)=2
    //       4           5           6             7            2^(3-1)=4
    //   8      9     10     11    12   13     14      15       2^(4-1)=8 个节点
    // 一个满二叉树满足以上规律，如果从一开始 第i个节点的左子树=2*i 右子树=2*i+1


    //                       0                                  2^(1-1)=1
    //             1                     2                      2^(2-1)=2
    //       3           4           5             6            2^(3-1)=4
    //   7      8     9     10    11   12     13      14        2^(4-1)=8 个节点
    // 一个满二叉树满足以上规律，如果从0开始 第i个节点的左子树=2*i+1 右子树=2*i+2

    //                       2                                  2^(1-1)=1
    //             3                    4                       2^(2-1)=2
    //       5           6           7             8            2^(3-1)=4
    //   9      10     11     12    13   14     15      16      2^(4-1)=8 个节点
    // 一个满二叉树满足以上规律，如果从一开始 第i个节点的左子树=2*i-1 右子树=2*i


    public static void main(String[] args) throws Exception {

        System.out.println("请输入数字："); // 这个有空了研究

        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        // 将字符数组的值赋给树的节点，此时每一个节点都没有子树，没有建立联系
        List<SimpleTree> lists = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            SimpleTree simpleTree = new SimpleTree(Integer.parseInt(String.valueOf(s[i])));
            lists.add(simpleTree);
        }
        // 为每一个节点添加左右子树
        for(int j= 0;j<lists.size()/2;j++){
            lists.get(j).left = lists.get(2*j+1);
            if(2*j+2<lists.size()) {
                lists.get(j).right = lists.get(2 * j + 2);
            }
        }
        // 前序输出
        System.out.println("=======前序遍历===========");
        prePrint(lists.get(0));
        // 中序输出
        System.out.println("=======中序遍历===========");
        middlePrint(lists.get(0));
        // 后序输出
        System.out.println("=======后序遍历===========");
        afterPrint(lists.get(0));

    }

    // 前序遍历输出
    public static void prePrint(SimpleTree node){
        if(node!=null){
            prePrint(node.left);
            System.out.println(node.data);
            prePrint(node.right);
        }
    }

    // 中序遍历输出
    public static void middlePrint(SimpleTree node){
        if(node!=null){
            System.out.println(node.data);
            middlePrint(node.left);
            middlePrint(node.right);
        }
    }

    // 后序遍历输出
    public static void afterPrint(SimpleTree node){
        if(node!=null){
            afterPrint(node.left);
            afterPrint(node.right);
            System.out.println(node.data);
        }
    }
}
