package com.hsb.feign.consumer.biz.web;

import com.hsb.feign.consumer.biz.service.ApiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/8/30.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private ApiUserService apiUserService;

    @GetMapping("/{id}")
    public String getUsernameById(@PathVariable("id") String id) {
        return apiUserService.getUserName(id);
    }
}
