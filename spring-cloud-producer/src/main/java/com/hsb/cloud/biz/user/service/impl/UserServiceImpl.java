package com.hsb.cloud.biz.user.service.impl;

import com.hsb.cloud.biz.common.model.User;
import com.hsb.cloud.biz.common.util.UserUtil;
import com.hsb.cloud.biz.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heshengbang on 2018/7/26.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAllUser() {
        return UserUtil.findAllUsers();
    }

    @Override
    public User findUserById(String id) {
        return UserUtil.findUserById(id);
    }

    @Override
    public User findUserByUsername(String username) {
        return UserUtil.findUserByUsername(username);
    }

    @Override
    public List<User> findUserByGender(String gender) {
        return UserUtil.findUserByGender(gender);
    }

    @Override
    public boolean insertUser(User user) {
        return UserUtil.insertUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return UserUtil.updateUser(user);
    }

    @Override
    public boolean deleteUser(User user) {
        return UserUtil.deleteUser(user);
    }
}
