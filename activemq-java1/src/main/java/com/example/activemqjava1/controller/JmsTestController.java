package com.example.activemqjava1.controller;

import com.example.activemqjava1.activemq.TopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试  activemq
 * @author qzz
 */
@RestController
@RequestMapping("/test")
public class JmsTestController {

    @Autowired
    private TopicProducer topicProducer;

    /**
     * 发送消息
     */
    @RequestMapping("/sendMessages")
    public void sendMessages(){
        for (int i=0;i<5;i++){
            topicProducer.sendTopic("this is a topic test"+i);
        }
    }
}
