package com.linked.mylinked;

/**
 * @author SUNLLM
 * @description
 * @date 2021/7/13
 */
public class MainLink {

    public static void main(String[] args) {

        Link link = new Link();

        for (int i = 0; i <5 ; i++) {
             link.addNode(i+"节点",i);
        }
        Link.Node root = link.getRoot();
        for (int i = 0; i <5 ; i++) {
            if(link.getRoot().getIndex()==4){
                link.getRoot().setNext(root);
            }
            link.setRoot(link.getRoot().getNext());
        }

        Link.Node one = link.getRoot();
        Link.Node two = link.getRoot().getNext().getNext();
        while(true){
            if(one.getIndex()==two.getIndex()) {
                System.out.println("this is a crycle");
                break;
            }
            one = one.getNext();
            two = two.getNext().getNext();
        }
    }
}
