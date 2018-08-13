package com.hsb.spring.boot.web;

import com.hsb.spring.boot.send.TopicMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 14:13
 */
@RestController
@RequestMapping("/topic")
public class TopicMessageController {
    @Autowired
    private TopicMessageSender topicMessageSender;

    /**
     * topic exchange类型rabbitmq测试
     */
    @PostMapping("/topic")
    public void topic() {
        topicMessageSender.send();
    }
}
