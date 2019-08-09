package com.cxgc.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * All Rights Reserved, Designed By ZHB.
 *
 * @author:
 * @date:
 * @copyright:
 */
@RestController
@Configuration
public class AskController {
    @Autowired
    RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping(value = "/ask")
    public String ask() {
        //RestTemplate将根据服务名eureka-client-service通过预先从eureka-service（即服务注册中心）缓存到本地的注册表中获取到eureka-client-service服务的具体地址，从而发起服务间调用
        String askHelloFromService = restTemplate.getForEntity("http://EUREKA-CLIENT-SERVICE/hello/{name}", String.class, name).getBody();
        return askHelloFromService;
    }

//    @Bean
//    @LoadBalanced//注意：此处@LoadBalanced用于配置负载均衡，此段代码已迁移到com.cxgc.serviceribbon.config.RestTemplateConfig
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
