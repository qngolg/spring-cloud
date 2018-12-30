package com.qngolg.springcloudhystrix.hystrixcommand;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class TestCommand extends HystrixCommand<String> {
    protected TestCommand(HystrixCommandGroupKey group) {
        super(group);
    }

    @Override
    protected String run() throws Exception {
        //这里需要做实际调用逻辑
        return "Hello";
    }
}
