package com.hsb.spring.cloud.consumer.hello.remote;/**
 * Created by heshengbang on 2018/7/13.
 */

import com.hsb.spring.cloud.consumer.hello.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by heshengbang on 2018/7/13.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
//@FeignClient(name= "{spring-cloud-producer}")
public interface HelloRemote {

    //restful api 调用
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name);

    //传统api调用
/*    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);*/

    @PostMapping("/echo/echo")
    String echo(@RequestBody User user);
}