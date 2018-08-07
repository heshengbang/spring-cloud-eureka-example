package com.hsb.spring.boot.web;

import com.hsb.spring.boot.entity.User;
import com.hsb.spring.boot.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/8/7.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userMapper.getUser(id);
    }

    @PostMapping("/")
    public int insertUser(@RequestBody User user) {
        return userMapper.insertUser(user);
    }

    @PutMapping("/")
    public int updateUser(@RequestBody User user) {
        return userMapper.updateUser(user);
    }

    @DeleteMapping("/")
    public int delete(@RequestParam("id") String id) {
        return userMapper.delete(id);
    }

}
