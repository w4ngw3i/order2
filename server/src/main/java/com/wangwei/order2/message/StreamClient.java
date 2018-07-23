package com.wangwei.order2.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @Auther wangwei
 * @Date 2018/4/14 上午11:37
 */

public interface StreamClient {

    String INPUT_CHANNEL = "test1";
    String OUTPUT_CHANNEL = "test2";

    @Input(StreamClient.INPUT_CHANNEL)
    SubscribableChannel input();

    @Output(StreamClient.OUTPUT_CHANNEL)
    MessageChannel output();
}
