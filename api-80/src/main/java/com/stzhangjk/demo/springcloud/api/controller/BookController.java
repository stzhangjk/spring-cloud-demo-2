package com.stzhangjk.demo.springcloud.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public Object list(){
        return restTemplate.getForObject("http://book-provider/book/list", String.class);
    }

}
