package com.hsb.spring.cloud.producer.web;

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
public class HelloController {

    //restful api方式
    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return "hello! " + name;
    }

    //传统api方式
    /*@RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is first messge";
    }*/

}