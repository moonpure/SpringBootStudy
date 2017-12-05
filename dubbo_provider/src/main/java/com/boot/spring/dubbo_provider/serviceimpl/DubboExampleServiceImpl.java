package com.boot.spring.dubbo_provider.serviceimpl;

import com.boot.spring.dubbo_api.DubboExampleService;
import org.springframework.stereotype.Service;

@Service
public class DubboExampleServiceImpl implements DubboExampleService {
    @Override
    public String getDubboMonth() {
        return "这是dubbo调用测试数据";
    }
}
