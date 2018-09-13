package com.hsb.zuul.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/9/10.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
@RequestMapping("/users")
public class WebController {
    @GetMapping("/{name}")
    public String findByName(@PathVariable("name") String name) {
        return "用户名为：" + name + " 的用户";
    }

    @GetMapping
    public String findAll() {
        return "查找所有用户";
    }

    @PutMapping
    public String update(@RequestBody String name) {
        return "用户：" + name + " 修改成功";
    }

    @PostMapping
    public String insert(@RequestBody String name) {
        return "用户：" + name + " 新增成功";
    }

    @DeleteMapping
    public String delete(@RequestBody String name) {
        return "用户：" + name + " 删除成功";
    }
}
