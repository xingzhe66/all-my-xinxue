package com.socket.cn.mysocket.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9898);

        // 获取到服务端监听对象信息
        Socket ss = serverSocket.accept();

        System.out.println("监听消息。。。。。。。");

//        // 1. 通过字节流的形式获取数据并输出
//        byte b []  = new byte[1024];
//        String str = "";
//        // 获取到字节输入流
          InputStream in = ss.getInputStream();
//        // 每次将数据读入到缓存字节流中，并且返回读取的长度，如果没有读取到返回-1，
//        // 然后获取缓存字节流中的数据拼接到字符串中
//        while(in.read(b)!=-1){
//            str = str.concat(new String(b));
//        }
//        System.out.println("===========使用字节流的方式进行了输出===============");
//        System.out.println(str);

        // 2. 通过字符流的形式获取数据并输出
        char [] c  = new char[1024];
        StringBuffer buffer = new StringBuffer();
        // 此处需要使用转换流将字节流转为字符流，这个意义不大，转换流也就这个作用，意义不大
        try(Reader reader = new InputStreamReader(in)) {
            while (reader.read(c) != -1) {
                buffer.append(c);
            }
        }

        System.out.println("===========使用字符流的方式进行了输出===============");
        System.out.println(buffer.toString());
        in.close();
        ss.close();

        serverSocket.close();






    }
}
