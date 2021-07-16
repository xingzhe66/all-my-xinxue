package com.my.link.mylink;

/**
 * @author 孙大圣
 * @description 致敬未来的自己
 * @date 2021/7/16
 */
public class MainLink3 {
    // 节点数量
    private static final int num = 5;

    public static void main(String[] args) {

        Link3 link3 = new Link3();

        for (int i = 0; i < num; i++) {
            link3.addNode("节点" + i, i);
        }
        System.out.println("========输出节点========");
        link3.printNode(link3.getRoot());

        // 尾节点指向头结点
        Link3.Node tmp = link3.getRoot();
        for (int i = 0; i < 5; i++) {
            if (tmp.getIndex() == 4) {
                tmp.setNext(link3.getRoot());
            }
            tmp = tmp.getNext();
        }
        // 判断是否是一个环形链表
        Link3.Node node1 = link3.getRoot();
        Link3.Node node2 = link3.getRoot().getNext().getNext();
        int a = 1;
        while (true) {
            if (node1.getIndex() == node2.getIndex()) {
                System.out.println("node1=="+node1.getData());
                System.out.println("node2=="+node2.getData());
                System.out.println("this is a crycle");
                break;
            }
            System.out.println("node1=="+node1.getData());
            System.out.println("node2=="+node2.getData());
            System.out.println("循环次数："+(a++));

            node1 = node1.getNext();
            node2 = node2.getNext().getNext();
            if(a>5){
                System.out.println("this is not a crycle");
                break;
            }
        }
    }
}
