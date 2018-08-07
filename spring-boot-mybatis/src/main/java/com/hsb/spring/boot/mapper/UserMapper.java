package com.hsb.spring.boot.mapper;

import com.hsb.spring.boot.entity.User;
import java.util.List;

/**
 * Created by heshengbang on 2018/8/7.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
public interface UserMapper {
    public List<User> getAllUsers();
    public User getUser(String id);
    public int updateUser(User user);
    public int insertUser(User user);
    public int delete(String id);
}
