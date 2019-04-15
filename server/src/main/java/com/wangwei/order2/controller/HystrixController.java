package com.wangwei.order2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class HystrixController {

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/getProductinfoList")
    public String getProductinfoList(){

        RestTemplate restTemplate = new RestTemplate();

//        if (true)
//            throw new RuntimeException("服务器出错");
        return restTemplate.postForObject("http://127.0.0.1:8087/product/listForOrder",
                Arrays.asList("157875227953464068"),
                String.class);
    }


    private String fallback(){
        return "哎呀，太拥挤了！ 请稍后再试~~";
    }
}
