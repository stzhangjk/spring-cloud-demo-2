package com.stzhangjk.demo.springcloud.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("book-provider")
public interface BookService {
    @GetMapping("/book/list")
    String list();
}
