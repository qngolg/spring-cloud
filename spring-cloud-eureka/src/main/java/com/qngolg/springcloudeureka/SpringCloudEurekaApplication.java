package com.qngolg.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.getBean("aa");
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
