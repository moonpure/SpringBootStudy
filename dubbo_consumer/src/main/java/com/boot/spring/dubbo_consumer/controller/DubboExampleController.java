package com.boot.spring.dubbo_consumer.controller;

import com.boot.spring.dubbo_api.DubboExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboExampleController {
    @Autowired
    DubboExampleService dubboExampleService;
    @RequestMapping("/getdubbo")
    @RequestBody
    public String getdubboExample()
    {
       return dubboExampleService.getDubboMonth();
    }
}
