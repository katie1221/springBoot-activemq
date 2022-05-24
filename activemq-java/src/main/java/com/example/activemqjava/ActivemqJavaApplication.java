package com.example.activemqjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * @author qzz
 * @EnableJms 会启动 jms 的注解扫描即发现 @JmsListener 注释的方法创建消息监听容器，相当于 <jms:annotation-d riven/>
 */
@SpringBootApplication
@EnableJms //启动消息队列
public class ActivemqJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqJavaApplication.class, args);
    }

}
