package com.stzhangjk.demo.springcloud.nacos.service;

import org.springframework.stereotype.Component;

@Component
public class NacosServiceFallback implements NacosService{
    @Override
    public String timeout() {
        return "超时了，等会儿";
    }
}
