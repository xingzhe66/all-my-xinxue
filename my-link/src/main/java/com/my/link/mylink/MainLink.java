package com.my.link.mylink;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/3
 * @return
 **/
public class MainLink {

    public static void main(String[] args) {

        Node root = new Node("头结点");
        root.setIndex(0);
        Node tmp = root;
        for (int i = 0; i <5 ; i++) {
            Node node = new Node("第"+(i+2)+"节点");
            node.setIndex(i+1);
            tmp.setNext(node);
            tmp = tmp.getNext();
        }
        print(root);
    }

    private static Node getNodeByIndex(Node root, int a){

        int index = root.getIndex();
        Node tem = root;
        while(index!=a){
            tem =tem.getNext();
            index ++;
        }
        return tem;
    }

    private static void print(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.getData());
        print(root.getNext());

    }
}
