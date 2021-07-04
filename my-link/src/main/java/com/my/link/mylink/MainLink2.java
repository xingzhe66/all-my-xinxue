package com.my.link.mylink;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/3
 * @return
 **/
public class MainLink2 {

    public static void main(String[] args) {

        Link link = new Link();
        for (int i = 0; i <5; i++) {
            link.add("第"+i+"个节点");
        }
        link.print(link.getRoot());
    }

}
