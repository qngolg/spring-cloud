package com.qngolg.springcloudhystrix.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//fallback 此处为服务熔断
@FeignClient(value = "hello-Service",fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping("/sayHello")
    public void sayHello(String name);


}
