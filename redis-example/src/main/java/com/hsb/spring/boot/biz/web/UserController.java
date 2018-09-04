package com.hsb.spring.boot.biz.web;

import com.hsb.spring.boot.biz.dao.UserDao;
import com.hsb.spring.boot.biz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/10 11:37
 */
@RestController
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userDao.getAll();
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {
        return userDao.getUserByUsername(username);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userDao.update(user);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody User user) {
        userDao.insert(user);
    }

    @DeleteMapping("/{username}")
    public void delete(@PathVariable("username") String username) {
        userDao.delete(username);
    }

    @GetMapping("/addAll")
    public void addAll() {
        userDao.addAll();
    }

    @GetMapping("/removeAll")
    public void removeAll() {
        userDao.removeAll();
    }

    @GetMapping("/")
    public List<User> getBatchByUsername(@RequestBody List<String> usernames) {
        return userDao.getBatchByUsername(usernames);
    }
}
