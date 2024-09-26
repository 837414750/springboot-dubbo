package com.boot.dubbo.springbootdubboprovider.service;

import com.boot.dubbo.springbootdubboapi.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "test01")
public class TestServiceImpl implements TestService {
    @Override
    public String testHello() {
        return "Hello test 1";
    }
}
