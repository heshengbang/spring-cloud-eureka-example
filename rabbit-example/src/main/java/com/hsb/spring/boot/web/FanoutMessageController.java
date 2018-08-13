package com.hsb.spring.boot.web;

import com.hsb.spring.boot.send.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 14:47
 */
@RestController
@RequestMapping("/fanout")
public class FanoutMessageController {

    @Autowired
    private FanoutSender fanoutSender;

    /**
     * fanout exchange类型rabbitmq测试
     */
    @PostMapping("/fanout")
    public void fanoutTest() {
        fanoutSender.send();
    }
}
