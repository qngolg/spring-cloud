package com.qngolg.springcloudhystrix.feign;

public class HelloServiceFallback implements HelloService
{
    @Override
    public void sayHello(String name) {
        System.out.println("服务熔断了");
    }
}
