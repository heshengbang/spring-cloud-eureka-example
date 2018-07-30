package com.hsb.zuul.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/30 18:45
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/{username}")
    public String famous(@PathVariable("username") String username) {
        return "Hello " + username + "!";
    }

    @GetMapping("/")
    public String animal(@RequestParam("animal") String animal) {
        return "Say Hello To " + animal + "!";
    }
}
