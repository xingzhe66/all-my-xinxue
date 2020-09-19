package com.socket.test.demo.test0;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author sunlonglong
 * 7:23
 * 境由心生,事在人为
 */
public class ClientSocket {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1",9999);
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("are you ok server？".getBytes());

        outputStream.close();
        s.close();
    }
}
