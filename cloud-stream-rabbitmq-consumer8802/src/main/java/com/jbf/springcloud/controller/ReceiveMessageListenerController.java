package com.jbf.springcloud.controller;

/**
 * @Auther: zhou
 * @Date: 2022/4/5 - 04 - 05 - 21:42
 * @Description: com.jbf.springcloud.controller
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;


@EnableBinding(Sink.class)
@Controller
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT) //监听
    public void input(Message<String> message){
        System.out.println("消费者1号------>收到的消息：" + message.getPayload() + "\t port：" + serverPort);
    }

}
