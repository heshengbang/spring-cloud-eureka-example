package com.hsb.spring.cloud.consumer.web;/**
 * Created by heshengbang on 2018/7/13.
 */

import com.hsb.spring.cloud.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/7/13.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
public class ConsumerController {

    private final HelloRemote helloRemote;

    @Autowired
    public ConsumerController(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}