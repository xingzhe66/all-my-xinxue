package com.other.demo.array;

import java.util.Scanner;

/**
 * @author SUNLLM
 * @description
 * @date 2021/2/5
 */

public class ArrayTest {


    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入任意数字，中间用逗号隔开：");
//        String next = scanner.next();
//        if (null != next && next != "") {
//            String[] str = next.split(",");
//            String min = str[0];
//            int a = 0;
//            for (int j = 0; j < str.length; j++) {
//                for (int i = j + 1; i < str.length; i++) {
//                    if (str[i].compareTo(min) < 0) {
//                        min = str[i];
//                        a = i;
//                    }
//                }
//                str[a] = str[j];
//                str[j] = min;
//                if((j+1)<str.length) {
//                    min = str[j + 1];
//                }
//            }
//            System.out.println("从小到大：");
//            for (int i = 0; i < str.length; i++) {
//                System.out.print(str[i]+",");
//            }
//            System.out.println();
//        }

        int a = 0;
        for (int i = 0; i <30 ; i++) {

            int b = 10;
            System.out.println(i);
            b = a + i+b;
            System.out.println(b);

        }
    }




}
