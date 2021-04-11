package com.stzhangjk.demo.springcloud.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider", fallback = NacosServiceFallback.class)
public interface NacosService {
    @GetMapping("/hystrix/timeout")
    String timeout();
}
