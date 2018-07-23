package com.wangwei.order2.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Auther wangwei
 * @Date 2018/4/14 上午11:39
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    @StreamListener(StreamClient.INPUT_CHANNEL)
    public void process(Object message){

        log.info("StreamReceiver: {}", message);

    }
}
