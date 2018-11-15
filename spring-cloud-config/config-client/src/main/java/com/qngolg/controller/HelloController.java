package com.qngolg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/15.
 */
@RestController
public class HelloController {


    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi(){
        return foo;
    }

}
