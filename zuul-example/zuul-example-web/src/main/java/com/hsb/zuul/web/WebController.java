package com.hsb.zuul.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/9/10.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
@RequestMapping("/web")
public class WebController {
    @GetMapping("/test")
    public String echo(@RequestParam("param") String param) {
        return param;
    }
}
