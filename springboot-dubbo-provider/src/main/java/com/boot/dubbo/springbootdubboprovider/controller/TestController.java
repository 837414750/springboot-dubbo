package com.boot.dubbo.springbootdubboprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Value("${aa}")
    private String name;

    @GetMapping
    public String test() {
        return name;
    }
}
