package com.hsb.spring.boot;

import com.hsb.spring.boot.entity.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
    @Qualifier("peopleKafkaTemplate")
    private KafkaTemplate<String, People> peopleKafkaTemplate;

    @Autowired
    @Qualifier("basicKafkaTemplate")
    private KafkaTemplate<String, String> basicKafkaTemplate;

    @RequestMapping("/sendPeople")
    public String sendPeople(@RequestParam("name") String name, @RequestParam("age") int age) {
        People people = new People();
        people.setName(name);
        people.setAge(age);
        people.setBorn(new Date());
        ListenableFuture<SendResult<String, People>> result = peopleKafkaTemplate.send("people", people);
        try {
            SendResult<String, People> sendResult = result.get();
            System.out.println("发送消息到people成功");
            return sendResult.getProducerRecord().key();
        } catch (InterruptedException | ExecutionException e) {
            log.info("发送消息到kafka， topic = {}", "test1", e);
        }
        return null;
    }

    @RequestMapping("/send")
    public String send(@RequestParam("msg") String msg, @RequestParam("topic") String topic){
        ListenableFuture<SendResult<String, String>> result = basicKafkaTemplate.send(topic, msg);
        try {
            SendResult<String, String> sendResult = result.get();
            System.out.println("发送消息到" + topic + "成功");
            return sendResult.getProducerRecord().key();
        } catch (InterruptedException | ExecutionException e) {
            log.info("发送消息到kafka， topic = {}", topic, e);
        }
        return null;
    }
}
