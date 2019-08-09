package com.example.service_hi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All Rights Reserved, Designed By ZHB.
 *
 * @author:
 * @date:
 * @copyright:
 */
@RestController
public class SayHelloController {

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello,".concat(name).concat("!");
    }


    @RequestMapping(value = "/msg")
    public String getMsg() {
        return "msg";
    }
}
