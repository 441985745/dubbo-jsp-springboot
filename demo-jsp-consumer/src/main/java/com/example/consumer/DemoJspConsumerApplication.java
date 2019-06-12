package com.example.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo //开启基于注解的dubbo
@SpringBootApplication
public class DemoJspConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJspConsumerApplication.class, args);
    }

}
