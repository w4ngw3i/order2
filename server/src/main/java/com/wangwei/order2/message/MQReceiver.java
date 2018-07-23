package com.wangwei.order2.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther wangwei
 * @Date 2018/4/13 下午2:06
 */
@Slf4j
@Component
public class MQReceiver {

    //1,@RabbitListener(queues = "myQueue")
    //2,自动创建队列@RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //3,自动创建, Exchange和queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message){

        log.info("MqReceiver={}", message);
    }


    /**
     * 数码供应商服务，接受消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            key = "computer",
            exchange = @Exchange("myOrder")
    ))
    public void productProcess(String message){

        log.info(" COMPUTER MqReceiver={}", message);
    }


    /**
     * 水果供应商服务，接受消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),
            key = "fruit",
            exchange = @Exchange("myOrder")
    ))
    public void fruitProcess(String message){

        log.info(" FRUIT MqReceiver={}", message);
    }
}
