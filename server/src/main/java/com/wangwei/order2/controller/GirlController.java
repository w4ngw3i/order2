package com.wangwei.order2.controller;

import com.wangwei.order2.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther wangwei
 * @Date 2018/4/12 下午4:31
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @RequestMapping("/girl/print")
    public String print(){
        return "name:" + girlConfig.getName() + "\tage:" + girlConfig.getAge();
    }
}
