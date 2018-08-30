package com.hsb.feign.producer.biz.web.api;

import com.hsb.feign.api.FeignUserService;
import com.hsb.feign.producer.biz.service.UserService;
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
@RequestMapping("/feign/users")
public class ApiUserControllerImpl implements FeignUserService {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getUserName(@PathVariable("id") String id) {
        return userService.getUserName(id);
    }
}
