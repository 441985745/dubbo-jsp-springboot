package com.example.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJspConsumerApplicationTests {
    Logger logger = LoggerFactory.getLogger(DemoJspConsumerApplicationTests.class);


    @Test
    public void contextLoads() {
        logger.debug("测试日志debug...");
        logger.info("测试日志info...");
        logger.warn("测试日志warn...");
        logger.error("测试日志error...");
    }

}
