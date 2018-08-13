package com.hsb.spring.boot.web;

import com.hsb.spring.boot.sender.ManyToManySenderA;
import com.hsb.spring.boot.sender.ManyToManySenderB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 13:53
 */
@RestController
public class ManyToManyController {
    @Autowired
    private ManyToManySenderA manyToManySenderA;
    @Autowired
    private ManyToManySenderB manyToManySenderB;

    @PostMapping("/manyToMany")
    public void manyToMany() {
        for (int i = 0; i < 10; i++) {
            manyToManySenderA.send("hello msg: " + i);
            manyToManySenderB.send("hello msg: " + i);
        }
    }
}
