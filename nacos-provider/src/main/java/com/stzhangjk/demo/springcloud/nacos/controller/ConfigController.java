package com.stzhangjk.demo.springcloud.nacos.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${someConfig:default}")
    private String someConfig;

    @GetMapping("/someConfig")
    public String get(){
        return someConfig;
    }

}
