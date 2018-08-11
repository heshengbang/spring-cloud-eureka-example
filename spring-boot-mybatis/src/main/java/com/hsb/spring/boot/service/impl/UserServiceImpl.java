package com.hsb.spring.boot.service.impl;

import com.hsb.spring.boot.entity.User;
import com.hsb.spring.boot.mapper.UserMapper;
import com.hsb.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/11 16:31
 */
@Service
public class UserServiceImpl implements UserService {
    private final RedisTemplate<String, Object> redisTemplate;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(RedisTemplate<String, Object> redisTemplate, UserMapper userMapper) {
        this.redisTemplate = redisTemplate;
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public User getUser(String id) {
        if (redisTemplate.hasKey(id)) {
            return (User) redisTemplate.opsForValue().get(id);
        }
        User user = userMapper.getUser(id);
        redisTemplate.opsForValue().set(id, user);
        return user;
    }

    @Override
    public int updateUser(User user) {
        int influenceRow = userMapper.updateUser(user);
        if (redisTemplate.hasKey(user.getId())) {
            redisTemplate.delete(user.getId());
            redisTemplate.opsForValue().set(user.getId(), user);
        }
        return influenceRow;
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int delete(String id) {
        int influenceRow = userMapper.delete(id);
        if (redisTemplate.hasKey(id)) {
            redisTemplate.delete(id);
        }
        return influenceRow;
    }
}
