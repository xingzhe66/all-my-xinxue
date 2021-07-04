package com.my.link.mylink;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/3
 * @return
 **/
public class Node {

    private String data;

    private int index;

    private Node next;

    private Node root;

    public Node(String data){
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getData() {
        return data;
    }



    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
