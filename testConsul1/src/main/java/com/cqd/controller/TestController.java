package com.cqd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${test1}")
    private String test1;
    @Value("${test2}")
    private String test2;

    @RequestMapping("test")
    public String test(){
        return test1+"^_^"+test2;
    }
}
