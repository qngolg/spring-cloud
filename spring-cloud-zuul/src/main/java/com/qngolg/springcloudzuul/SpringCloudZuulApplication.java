package com.qngolg.springcloudzuul;

import com.qngolg.springcloudzuul.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }


    //将filter注册为bean
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}

