package com.poinory.exampletemplatedemo.service;


import com.poinory.example.autoconfigure.ExampleTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    private ExampleTemplate exampleTemplate;

    @PostConstruct
    public void init() {
        exampleTemplate.showInfo();
    }
}
