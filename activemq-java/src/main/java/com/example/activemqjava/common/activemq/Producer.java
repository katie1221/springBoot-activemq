package com.example.activemqjava.common.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

/**
 * 生产者
 * @author qzz
 */
@Component
public class Producer {

    @Autowired
    private Queue queue;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送消息
     * @param msg
     */
    public void sendMessage(String msg){
        //方法一：添加消息对消息队列
        jmsMessagingTemplate.convertAndSend(queue,msg);
        //方法二：这种方式不需要手动创建queue,系统会自动创建名为test的队列
//        jmsMessagingTemplate.convertAndSend("test",msg);
    }

    /**
     * 发送消息
     * @param msg
     */
    public void sendMessage(String destination,String msg){
        //方法二：这种方式不需要手动创建queue,系统会自动创建名为test的队列
        if(destination!=null){
            jmsMessagingTemplate.convertAndSend(destination,msg);
        }
    }
}
