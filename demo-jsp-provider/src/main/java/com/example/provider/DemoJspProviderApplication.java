package com.example.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo //开始基于注解的dubbo功能
@SpringBootApplication
public class DemoJspProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJspProviderApplication.class, args);
    }

}
