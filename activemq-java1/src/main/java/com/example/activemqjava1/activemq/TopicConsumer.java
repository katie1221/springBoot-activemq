package com.example.activemqjava1.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 订阅者
 * @author qzz
 */

@Component
public class TopicConsumer {

    /**
     * 消费消息
     * 使用JmsListener配置消费者监听的topic，其中message是接收到的消息
     * @param message
     */
    @JmsListener(destination = "my-topic",containerFactory = "topicListener")
    public void receiveTopic(String message){
        System.out.println("TopicConsumer接收的消息是："+message);
    }
}
