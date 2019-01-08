package com.provider.service;

import com.api.service.Demoapi;

public class DemoApiImpl implements Demoapi {
    @Override
    public String sayHello() {
        return "Hello dubbo!";
    }
}
