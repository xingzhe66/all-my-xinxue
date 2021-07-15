package com.linked.mylinked;

/**
 * @author SUNLLM
 * @description
 * @date 2021/7/13
 */
public class Link {


    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    class Node{

        private Node next;

        private String data;

        private int index;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

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

        public Node(){}

        public void add(Node node){
           if(this.next==null){
               this.next = node;
           }else{
               this.next.add(node);
           }
        }

        public void print(Node node){
            if(node!=null &&6==(node.getIndex())){
                System.out.println("======this is a crycle======");
                return;
            }
            if(node==null){
                System.out.println("====this is not a cnode!=nullrycle=====");
                return;
            }
            node.setIndex(6);
            System.out.println(node.data);
            print(node.next);
        }
    }

    public void addNode(String data,int index){
        Node node = new Node(data);
        node.setIndex(index);
        if(root==null){
            root = node;
        }else{
            root.add(node);
        }
    }

    public void linkPrint(Node node){
        new Node().print(node);
    }
}
