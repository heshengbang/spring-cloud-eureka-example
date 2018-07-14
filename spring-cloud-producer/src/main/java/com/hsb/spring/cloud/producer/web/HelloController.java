package com.hsb.spring.cloud.producer.web;

import com.hsb.spring.cloud.producer.dto.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/7/13.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
@RefreshScope
@Slf4j
public class HelloController {

    //restful api方式
    @ApiOperation(value="通过get方法访问", notes="测试get方式发送的请求")// 使用该注解描述接口方法信息
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "访问者名字", required = true, dataType = "String", paramType="path")
    })// 使用该注解描述方法参数信息，此处需要注意的是paramType参数，需要配置成path，否则在UI中访问接口方法时，会报错
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        log.info("一个get请求到达，它的参数是：" + name);
        return "hello! " + name;
    }

    //传统api方式
    /*@RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is first messge";
    }*/

    @ApiOperation(value="通过post方法访问的请求")
    @PostMapping("/echo/echo")
    String echo(@RequestBody User user) {
        log.info("一个post请求到达，它的参数是：" + user);
        return "echo: " + user.getUsername() + "!";
    }
}