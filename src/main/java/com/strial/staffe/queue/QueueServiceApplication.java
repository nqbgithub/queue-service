package com.strial.staffe.queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消息队列服务
 */
@SpringBootApplication
@EnableEurekaClient
public class QueueServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(QueueServiceApplication.class,args);
    }
}
