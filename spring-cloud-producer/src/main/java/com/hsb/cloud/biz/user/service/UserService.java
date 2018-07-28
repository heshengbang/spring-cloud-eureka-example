package com.hsb.cloud.biz.user.service;

import com.hsb.cloud.biz.common.model.User;

import java.util.List;

/**
 * Created by heshengbang on 2018/7/26.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
public interface UserService {
    public List<User> findAllUser();
    public User findUserById(String id);
    public User findUserByUsername(String username);
    public List<User> findUserByGender(String gender);
    public boolean insertUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(User user);
}
