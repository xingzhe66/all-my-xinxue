package com.my.link.mylink;

/**
 * @author 孙大圣
 * @description 致敬未来的自己
 * @date 2021/7/16
 */
public class Link3 {

    private Node root;

    private Node temp;

    public Node getTemp() {
        return temp;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public Node getRoot() {
        return root;
    }

     class Node{
        private Node next;

        private String data;
        // 节点下标
        private int index;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node(String data){
            this.data = data;
        }

         public Node getNext() {
             return next;
         }

         public void setNext(Node next) {
             this.next = next;
         }

         // 递归添加节点
        private void add(Node node){
            if(this.next==null){
                this.next = node;
            }else{
                this.next.add(node);
            }
        }
    }

    // 添加节点
    public void addNode(String data,int index){
        Node node = new Node(data);
        node.setIndex(index);
        if(this.root == null){
            this.root = node;
        }else{
            root.add(node);
        }
    }

    // 输出节点
    public void printNode(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        this.printNode(root.next);

    }



}
