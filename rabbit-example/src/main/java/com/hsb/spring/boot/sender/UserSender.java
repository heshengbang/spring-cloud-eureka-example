package com.hsb.spring.boot.sender;

import com.hsb.spring.boot.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 13:59
 */

@Component
public class UserSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        User user = new User();
        user.setName("hsb");
        user.setPass("123456789");
        System.out.println("user sender : " + user.getName() + "/" + user.getPass());
        this.rabbitTemplate.convertAndSend("userQueue", user);
    }
}
