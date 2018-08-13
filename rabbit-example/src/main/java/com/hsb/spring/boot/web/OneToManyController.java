package com.hsb.spring.boot.web;

import com.hsb.spring.boot.sender.OneToManySender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 13:40
 */

@RestController
@RequestMapping("/oneToMany")
public class OneToManyController {
    @Autowired
    private OneToManySender oneToManySender1;

    @PostMapping("/hello")
    public void hello() {
        oneToManySender1.send("hello");
    }

    /**
     * 单生产者-多消费者
     */
    @PostMapping("/oneToMany")
    public void oneToMany() {
        for (int i = 0; i < 10; i++) {
            oneToManySender1.send("hello msg: " + i);
        }
    }
}
