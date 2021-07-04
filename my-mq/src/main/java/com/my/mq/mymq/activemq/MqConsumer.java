package com.my.mq.mymq.activemq;


/**
 * @author sunlonglong
 * 20:52
 * 境由心生,事在人为
 */
public class MqConsumer {

    public static void main(String[] args) throws Exception{

//        // 创建连接工厂
//        ConnectionFactory conFac = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
//        // 根据连接工厂创建连接
//        Connection con = conFac.createConnection();
//        // 启动连接
//        con.start();
//        // 使用连接创建一个回话
//        WebFluxProperties.Session session = con.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
//        // 使用会话创建一个消费目标对象
//        //Queue queue = session.createQueue("test-queue");
//        Topic topic = session.createTopic("test-topic");
//        // 创建消费者对象
//        MessageConsumer consumer = session.createConsumer(topic);
//
//
//            consumer.setMessageListener(new MessageListener() {
//                @Override
//                public void onMessage(Message message) {
//                    if (message instanceof TextMessage) {
//                        TextMessage message1 = (TextMessage) message;
//                        try {
//
//                            System.out.println("=======================");
//                            System.out.println(message1.getText());
//                            System.out.println("=======================");
//                        } catch (JMSException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            });
//        //8、程序等待接收用户消息
//        System.in.read();
//
//
//
//        consumer.close();
//        session.close();
//        con.close();
    }

}
