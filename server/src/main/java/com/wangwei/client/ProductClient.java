package com.wangwei.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther wangwei
 * @Date 2018/4/8 下午2:21
 */
@FeignClient(value = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String getProductMsg();
}
