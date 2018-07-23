package com.wangwei.order2.controller;

import com.wangwei.order2.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther wangwei
 * @Date 2018/4/14 上午11:43
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/sendMessage")
    public void process(){

        String message = "now :" + new Date();

        streamClient.output().send(MessageBuilder.withPayload(message).build());



    }
}
