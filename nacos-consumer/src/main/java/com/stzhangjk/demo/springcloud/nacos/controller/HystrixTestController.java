package com.stzhangjk.demo.springcloud.nacos.controller;

import com.stzhangjk.demo.springcloud.nacos.service.NacosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixTestController {

    @Autowired
    private NacosService service;

    @GetMapping("/timeout")
    public String timeout(){
        return service.timeout();
    }

}
