package com.socket.cn.mysocket.socket;

import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {


    public static void main(String[] args) throws Exception {

        // 连接本地socke
        Socket socket = new Socket("127.0.0.1", 9898);
        // 获取套接字输出流
        OutputStream outputStream = socket.getOutputStream();
        // 发送消息
        outputStream.write("information is comming".getBytes());

        outputStream.close();
        socket.close();

    }

}
