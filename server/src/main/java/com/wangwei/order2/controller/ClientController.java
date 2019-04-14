package com.wangwei.order2.controller;





import com.wangwei.product.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther wangwei
 * @Date 2018/4/9 下午12:40
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private ProductClient productClient;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){

        String productMsg = productClient.getProductMsg();
        log.info("productMsg:{}", productMsg);
        return productMsg;
        /**
         * 第一种方式：适合单个服务地址url直接写死
         */
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://127.0.0.1:8080/msg", String.class);
//        log.info("response={}", response);
//        return response;

        /**
         * 第二种方式：利用loadBalancerClient根据服务名获取对应的多个URL
         */
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/msg";
//        String resopnse = restTemplate.getForObject(url, String.class);
//        log.info("response={}", resopnse);
//        return resopnse;

        /**
         *第三种方式利用注解@LoadBalanced
         */
//        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
//        log.info("response={}", response);
//        return response;


    }
}
