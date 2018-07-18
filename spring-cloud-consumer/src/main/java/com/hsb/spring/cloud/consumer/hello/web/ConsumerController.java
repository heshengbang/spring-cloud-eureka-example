package com.hsb.spring.cloud.consumer.hello.web;/**
 * Created by heshengbang on 2018/7/13.
 */

import com.hsb.spring.cloud.consumer.hello.dto.User;
import com.hsb.spring.cloud.consumer.hello.remote.HelloRemote;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ConsumerController {

    private final HelloRemote helloRemote;

    @Autowired
    public ConsumerController(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        log.info("调用了spring-cloud-producer的hello方法来完成本次请求");
        return helloRemote.hello(name);
    }

    @GetMapping("/echo/echo")
    public String echo() {
        User user = new User();
        user.setUsername("heshengbang");
        user.setGender("female");
        log.info("调用了spring-cloud-producer的echo方法来完成本次请求");
        return helloRemote.echo(user);
    }
}