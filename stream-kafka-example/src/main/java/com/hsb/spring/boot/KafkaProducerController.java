package com.hsb.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/12/29 9:17
 */
@RestController
@Slf4j
public class KafkaProducerController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(@RequestParam("msg") String msg){
        ListenableFuture<SendResult<String, String>> result = kafkaTemplate.send("xixi", msg);
        try {
            SendResult<String, String> sendResult = result.get();
            return sendResult.getProducerRecord().key();
        } catch (InterruptedException | ExecutionException e) {
            log.info("发送消息到kafka， topic{}", "test1", e);
        }
        return null;
    }
}
