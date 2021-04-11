package com.stzhangjk.demo.springcloud.api.controller;

import com.stzhangjk.demo.springcloud.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/feign")
public class BookFeignController {

    @Autowired
    private BookService service;

    @GetMapping("/list")
    public Object list(){
        return service.list();
    }

}
