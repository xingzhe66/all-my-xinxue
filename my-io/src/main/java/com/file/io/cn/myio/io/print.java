package com.file.io.cn.myio.io;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;


public class print {

    private final static  String FILE_PATH = "E:" + File.separator + "file"+File.separator +"print"+".txt";
//    public static void main(String[] args) throws FileNotFoundException {
//
//        // PrintStream(字节打印流) 和PrintWriter(字符打印流）只有这两个流，没有其他
//        // 这两种流存在的意义在于可以输出除字符串之外的其他数据类型的值：float,double,boolean等
//        File file = new File(FILE_PATH);
//
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//
//        PrintStream printStream = new PrintStream(new FileOutputStream(file,true));
//
//        // 向文件中写入各种值
//        printStream.println("=========use printStream writer==============");
//        printStream.println('c');
//        printStream.println(File.separator);
//        printStream.println(12);
//        printStream.println(File.separator);
//        printStream.println(Boolean.FALSE);
//        printStream.close();
//
//        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file,true));
//        printWriter.println("=========use printWriter writer==============");
//        printWriter.println("hello");
//        printWriter.println(File.separator);
//        printWriter.println(3.1415926);
//        printWriter.println(File.separator);
//        printWriter.println(666);
//        System.out.println("文件写入成功");
//
//
//        printWriter.close();
//
//    }




    public class Main{
        public static void main（String [] args）{
            Scanner sc = new Scanner(System.in);
            TreeSet <Integer> set = new TreeSet<>();
            while(sc.hasNext()){
                int n = sc.nextInt();
                if(n>0){
                    for(int i=0;i<n;i++){
                        set.add(sc.nextInt());
                    }
                }
                for(Integer se:set){
                    System.out.println(se);
                }
            }
        }

    }
}
