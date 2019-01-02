package com.hsb.spring.boot;

import com.hsb.spring.boot.entity.People;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/12/29 9:23
 */
@Component
public class ConsumerListener {
    @KafkaListener(topics = {"xixi", "test1"}, containerFactory = "basicListener")
    public void listen (ConsumerRecord<String, String> record) {
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }

    @KafkaListener(topics = "people", containerFactory = "peopleListener")
    public void listenPeople(ConsumerRecord<String, People> record) {
        System.out.printf("topic = %s, offset = %d \n", record.topic(), record.offset());
        System.out.printf("名字 = %s  出生日期 = %s  年龄 = %s", record.value().getName(), record.value().getBorn(), record.value().getAge());
    }
}
