package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.boot.domain.User;
import com.boot.service.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
@RequestMapping("/")
public class TestController {
    @Reference
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        //@Reference
        String restr=testService.sayHello("Hello springboot and dubbo!");
      return   restr;

    }

    @GetMapping("user")
    public User user() {

          //  testService.sayHello("Hello springboot and dubbo!");
        User person=testService.findUser();
       // System.err.println("立即返回的为null:"+person);
        //拿到调用的Future引用，当结果返回后，会被通知和设置到此Future。
//        try {
//            Future<User> pFuture = RpcContext.getContext().getFuture();
//            person = pFuture.get();
//        }
//        catch (Exception ex)
//        {
//
//        }
            return person;

    }
}
