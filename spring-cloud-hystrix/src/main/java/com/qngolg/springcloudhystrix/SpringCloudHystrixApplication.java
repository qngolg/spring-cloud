package com.qngolg.springcloudhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCircuitBreaker //开启断路器
@SpringBootApplication
@DefaultProperties(defaultFallback = "defaultFallback") //服务降级
public class SpringCloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixApplication.class, args);
    }

    @GetMapping(value = "sayHi")
    public String sayHi(){
//        throw new RuntimeException("异常了");
        return "hi";
    }

    public String defaultFallback(){
        return "太拥挤了";
    }


}

