package com.my.link.mylink;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/3
 * @return
 **/
public class Link {
    // Node用来报错节点和数据，内部的属性可以被外部访问，那就直接使用内部类
    // 对外直接暴露link类

    private class Node{
        private String data;

        private Node next;


        public Node(String data){
            this.data = data;
        }

        public void addNode(Node node){
            // 判断当前节点的下一个节点是否为空，那个节点调用addNode，那个节点就是this.
            if(this.next==null){
                this.next = node;
            }else{
                // 当前节点的下一个节点添加节点
                this.next.addNode(node);
            }
        }
    }

    // 头节点
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void add(String data){
        Node n = new Node(data);
        if(root == null){
            root = n;
        }else{
            root.addNode(n);
        }
    }

    public void print(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        print(root.next);
    }



}
