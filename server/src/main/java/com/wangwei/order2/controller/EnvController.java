package com.wangwei.order2.controller;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther wangwei
 * @Date 2018/4/11 下午5:44
 */
@RestController
@RequestMapping("/env")
@RefreshScope //
public class EnvController {

//    @Value("${env}")
//    private String env;

    @Autowired
    private Environment environment;

//    public void setEnv(String env) {
//        this.env = env;
//    }

    @GetMapping("/getEnv")
    public String getEnv() {
        return environment.getProperty("dev");
    }
}
