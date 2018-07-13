package com.hsb.spring.cloud.consumer.remote;/**
 * Created by heshengbang on 2018/7/13.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by heshengbang on 2018/7/13.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {

    //restful api 调用
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name);

    //传统api调用
/*    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);*/
}