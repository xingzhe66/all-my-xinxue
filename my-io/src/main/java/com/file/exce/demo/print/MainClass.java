package com.file.exce.demo.print;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author sunlonglong
 * 9:35
 * 境由心生,事在人为
 */
public class MainClass {
    public static void main(String[] args) throws Exception {

        // 打印流有printStrea（打印字节流） 和PrintWriter(打印字符流），只有这两个
        // 为了能够写入除字符外的 float,boolean,double等数据类型
        File file = new File("D:"+File.separator+"my_test"+File.separator+"my.txt");
        if(!(file.getParentFile().exists())){
            file.getParentFile().mkdirs();
        }

        System.out.println("使用打印流写入文件，也就是这个功能，没有其他功能");
        PrintStream writer = new PrintStream(new FileOutputStream(file));
        writer.println(12);
        writer.println(12.121);
        writer.println(Boolean.FALSE);
    }
}
