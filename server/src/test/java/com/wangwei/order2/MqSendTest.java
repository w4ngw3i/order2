package com.wangwei.order2;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送mq消息测试
 * @Auther wangwei
 * @Date 2018/4/13 下午2:09
 */
@Component
public class MqSendTest extends Order2ApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){

        amqpTemplate.convertAndSend("myQueue", new Date());

    }

    @Test
    public void sendOrder(){

        amqpTemplate.convertAndSend("myOrder", "computer" , "数码供应商服务");

    }
}
