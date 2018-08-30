package com.hsb.feign.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heshengbang on 2018/8/30.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RequestMapping("/feign/users")
public interface FeignUserService {
    @GetMapping("/{id}")
    String getUserName(@PathVariable("id") String id);
}