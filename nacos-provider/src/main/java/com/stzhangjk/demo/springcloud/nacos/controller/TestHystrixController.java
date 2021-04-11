package com.stzhangjk.demo.springcloud.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class TestHystrixController {

    @GetMapping("/timeout")
    public String timeout(){
        throw new RuntimeException("错误");
//        return "没超时";
    }

}
