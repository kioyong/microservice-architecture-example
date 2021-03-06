package com.example.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/location")
public class GreetingController {

    @Value("${spring.application.name:}")
    private String applicationName;

    /**
     * 提供一个基础的 Restful 接口给 API 层调用
     **/
    @GetMapping
    public String hello() {
        return "Hello Microservice, Message from service: " + applicationName;
    }

}
