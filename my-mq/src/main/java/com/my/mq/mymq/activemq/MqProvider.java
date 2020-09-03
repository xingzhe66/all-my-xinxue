package com.my.mq.mymq.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQMessage;

import javax.jms.*;

/**
 * @author sunlonglong
 * 20:52
 * 境由心生,事在人为
 */
public class MqProvider {

    public static void main(String[] args) throws Exception{

        // 创建连接工厂
        ConnectionFactory connect = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
        // 使用工厂创建一个连接对象
        Connection con = connect.createConnection();
        // 开启连接
        con.start();

        // 使用连接对象创建一个sesion回话
        Session session = con.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);

        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        //Queue queue = session.createQueue("test-queue");
        Topic topic = session.createTopic("test-topic");
        // 使用session 会话创建一个生产者对象
        MessageProducer producer = session.createProducer(topic);
        // 使用session 创建一个消息对象
        TextMessage message = session.createTextMessage("this is a producer message");


        producer.send(message);

        // 关闭资源

        producer.close();
        session.close();
        con.close();


    }
}
