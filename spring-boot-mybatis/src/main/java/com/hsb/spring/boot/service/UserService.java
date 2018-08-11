package com.hsb.spring.boot.service;

import com.hsb.spring.boot.entity.User;

import java.util.List;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/11 16:30
 */

public interface UserService {
    public List<User> getAllUsers();
    public User getUser(String id);
    public int updateUser(User user);
    public int insertUser(User user);
    public int delete(String id);
}
