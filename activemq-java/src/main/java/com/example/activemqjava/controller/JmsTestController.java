package com.example.activemqjava.controller;

import com.example.activemqjava.common.activemq.Producer;
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
    private Producer producer;

    /**
     * 发送消息
     */
    @RequestMapping("/sendMessages")
    public void sendMessages(){
        for (int i=0;i<5;i++){
            producer.sendMessage("this is a queue test"+i);
        }
    }
}
