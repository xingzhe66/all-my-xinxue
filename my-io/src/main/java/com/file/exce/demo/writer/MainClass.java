package com.file.exce.demo.writer;

import java.io.*;

/**
 * @author sunlonglong
 * 9:08
 * 境由心生,事在人为
 */
public class MainClass {
    public static void main(String[] args) throws Exception {
        System.out.println("======使用字符流来进行文件的写入读取操作=====");
        File file = new File("D:"+File.separator+"File_test"+ File.separator+".txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        String str = "昨天认识了一个女孩子，今天是不是该聊聊";
        // wirter 字符输出流
       try(Writer writer = new FileWriter(file)){
           writer.write(str);
       }
        System.out.println("====文件写入成功！！！====");
        // writer 可以直接一次性写入一个字符串，但是Reader不可以直接读取一个字符串，只能先读取到字符缓存数组中
        //因为Reader的时候不知道文件大小，只能一次读取程序可以容纳的数据大小，否则一次读取会使得程序卡死
        try(Reader reader = new FileReader(file)){
            char [] c = new char[1024];
            int data = reader.read(c);
            System.out.println(new String(c,0,data));
        }

        // 字节流： OutPutStream out = FileOutPutStream() 和输入流
        // 字符流： Writer writer = FileWriter() 和输入字符流
        // 注意 ： OutputStreamReader  和 InputStreamWriter是转换流，接收字节流，返回字符流，把字节转为字符
        // 这个意义不大，只需要注意字节流和字符流就可以，这个转换流意义不大

    }
}
