package com.example.demo.config;


import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类，就是来替代Spring配置文件的
 *
 * 在配置文件中使用<bean></bean>标签添加组件
 */
@Configuration
public class MyConfig {


    @Bean
    public HelloService helloService1(){
        System.out.println("配种类@Bean给容器中添加了组件。。。");
        return new HelloService();

    }


}
