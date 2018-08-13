package com.hsb.spring.boot.web;

import com.hsb.spring.boot.sender.CallBackSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 15:18
 */
@RestController
public class CallBackController {
    @Autowired
    private CallBackSender callBackSender;

    @PostMapping("/callback")
    public void callback() {
        callBackSender.send();
    }
}
