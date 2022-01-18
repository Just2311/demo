package com.example.demo;

import com.example.demo.bean.Person;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * SpringBoot单元测试
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService1");
        System.out.println(b);
    }

    @Test
    public void testLog(){
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
