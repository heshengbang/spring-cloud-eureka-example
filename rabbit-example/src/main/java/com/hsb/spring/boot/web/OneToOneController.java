package com.hsb.spring.boot.web;

import com.hsb.spring.boot.send.OneToOneSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 11:57
 */

@RestController
@RequestMapping("/oneToOne")
public class OneToOneController {

    @Autowired
    private OneToOneSender oneToOneSender;

    @PostMapping("/hello")
    public void hello() {
        oneToOneSender.send();
    }
}
