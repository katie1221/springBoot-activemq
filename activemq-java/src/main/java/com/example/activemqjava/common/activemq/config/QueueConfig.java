package com.example.activemqjava.common.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * Queue配置
 * Queue为点对点模式，即有一个消息，才能有一个消费，多个消费者不会重复对应一个消息
 * @author qzz
 */
@Configuration
public class QueueConfig {

    /**
     * 定义存放消息的队列
     * @return
     */
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("my-test");
    }

}
