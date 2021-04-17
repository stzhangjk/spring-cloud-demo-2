package com.stzhangjk.demo.springcloud.alibaba.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SentinelGatewayApplication {

    @SentinelResource(value = "hello", blockHandler = "blockHello")
    @GetMapping("/hello")
    public String hello(){
        return "hello 123";
    }

    /**
     * 降级方法
     */
    public String blockHello(BlockException e){
        return "block hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SentinelGatewayApplication.class, args);
    }
}
