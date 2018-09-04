package com.hsb.spring.boot.biz.dao;

import com.hsb.spring.boot.biz.model.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/10 11:37
 */
@Repository
public class UserDao {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private static List<User> users = new ArrayList<>();

    static {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1918, Calendar.AUGUST, 11);
        User user1 = new User("heshengbang", "1a2b3c4d5c6d", 22, calendar1.getTime());
        users.add(user1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1988, Calendar.DECEMBER, 23);
        User user2 = new User("tongheshang", "987def-654", 2, calendar2.getTime());
        users.add(user2);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1998, Calendar.FEBRUARY, 1);
        User user3 = new User("dilireba", "AB-56-XM001", 28, calendar3.getTime());
        users.add(user3);
    }

    public List<User> getAll() {
        return users;
    }

    public User getUserByUsername(String username) {
        System.out.println("查询操作被执行================");
        if (!redisTemplate.hasKey(username)) {
            return null;
        }
        return (User) redisTemplate.opsForValue().get(username);
//        for (User user : users) {
//            if (username.equals(user.getUsername())) {
//                return user;
//            }
//        }
//        return null;
    }

    public void update(User user) {
        if (user == null || !StringUtils.hasText(user.getUsername())) {
            return;
        }
        if (redisTemplate.hasKey(user.getUsername())) {
            redisTemplate.delete(user.getUsername());
        }
        redisTemplate.opsForValue().set(user.getUsername(), user);
    }

    public void insert(User user) {
        if (user == null || !StringUtils.hasText(user.getUsername())) {
            return;
        }
        redisTemplate.opsForValue().set(user.getUsername(), user);
    }

    public void delete(String username) {
        if (!StringUtils.hasText(username)) {
            return;
        }
        if (redisTemplate.hasKey(username)) {
            redisTemplate.delete(username);
        }
    }

    public void addAll() {

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1918, Calendar.AUGUST, 11);
        User user1 = new User("heshengbang", "1a2b3c4d5c6d", 22, calendar1.getTime());
        redisTemplate.opsForValue().set(user1.getUsername(), user1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1988, Calendar.DECEMBER, 23);
        User user2 = new User("tongheshang", "987def-654", 2, calendar2.getTime());
        redisTemplate.opsForValue().set(user2.getUsername(), user2);

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1998, Calendar.FEBRUARY, 1);
        User user3 = new User("dilireba", "AB-56-XM001", 28, calendar3.getTime());
        redisTemplate.opsForValue().set(user3.getUsername(), user3);

//        redisTemplate.opsForValue()
//        redisTemplate.opsForZSet()
//        redisTemplate.opsForHyperLogLog()
//        redisTemplate.opsForSet()
//        redisTemplate.opsForList()
//        redisTemplate.opsForCluster()
//        redisTemplate.opsForGeo()
//        redisTemplate.opsForHash()
    }

    public void removeAll() {
        redisTemplate.delete("heshengbang");
        redisTemplate.delete("tongheshang");
        redisTemplate.delete("dilireba");
    }

    public List<User> getBatchByUsername(List<String> usernames) {
        List<User> results = new ArrayList<>(usernames.size());
        usernames.forEach(username -> {
            if (redisTemplate.hasKey(username)) {
                results.add((User) redisTemplate.opsForValue().get(username));
            } else {
                users.forEach(user -> {
                    if (user.getUsername().equals(username)) {
                        results.add(user);
                    }
                });
            }
        });
        return results;
    }
}
