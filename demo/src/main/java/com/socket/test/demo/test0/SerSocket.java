package com.socket.test.demo.test0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sunlonglong
 * 7:26
 * 境由心生,事在人为
 */
public class SerSocket {
    public static void main(String[] args) throws  Exception {
        StringBuffer sb ;
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("服务端等待监听端口。。。。。。。");
        InputStreamReader inReader =null;
        // 不断监听客户端发送的信息
        while (true) {
            sb=new StringBuffer();
            Socket s = ss.accept();

             inReader = new InputStreamReader(s.getInputStream());

            //InputStream inputStream = s.getInputStream();
            byte[] buffer = new byte[1024];
            char[] c = new char[1024];
            int len;
            // 每次将数据读入缓存字节数组 buffer
            while ((len = inReader.read(c)) != -1) {
                sb.append(new String(c, 0, len));
            }

            System.out.println(sb.toString());
            inReader.close();
            s.close();

    }
//        inReader.close();
//        s.close();
//        ss.close();
    }
}
