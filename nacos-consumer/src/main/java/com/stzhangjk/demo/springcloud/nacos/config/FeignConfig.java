package com.stzhangjk.demo.springcloud.nacos.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FeignConfig {

    /**
     * To disable Hystrix support on a per-client basis
     * @return
     */
//    @Bean
//    @Scope("/prototype")
//    public Feign.Builder feignBuilder(){
//        return Feign.builder();
//    }
}
