package com.wangwei.order2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Auther wangwei
 * @Date 2018/4/12 下午4:29
 */
@Component
@Data
@ConfigurationProperties("girl")
@RefreshScope
public class GirlConfig {

    private String name;

    private String age;
}
