package com.hsb.cloud.biz.common.util;

import com.hsb.cloud.biz.common.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
public class UserUtil {
    private static List<User> users = new ArrayList<>();
    private static List<String> location = new ArrayList<>(Arrays.asList("ChengDu", "ChongQing", "XiAn", "BeiJing", "ShangHai"));
    private static List<String> first_name = new ArrayList<>(Arrays.asList("Kevin", "Russel", "James", "Stephen", "Tim", "Devin", "LeBron", "Michael", "Klay", "George"));
    private static List<String> last_name = new ArrayList<>(Arrays.asList("Durant", "Westbrook", "Harden", "Curry", "Duncan", "Book", "Jones", "Jordan", "Thompson", "Soros"));
    private static List<String> ids = new ArrayList<>();
    private static List<String> emotional_state = new ArrayList<>(Arrays.asList("Single", "In Love", "Married", "Divorce", "Widowhood"));
    private static List<String> gender = new ArrayList<>(Arrays.asList("Male", "Female", "Trans-Gender", "Asexual"));
    static {
        for (int i = 0; i < 10; i++) {
            ids.add(UUID.randomUUID().toString());
        }
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(getId(i));
            user.setAge(new Random().nextInt(100));
            user.setAlias(getAlias(i));
            user.setBirth(getBirth());
            user.setCreateBy(getCreateBy(user.getId(), i));
            user.setCreateTime(new Date());
            user.setEmotional_state(getEmotionalState(i));
            user.setGender(getGender(i));
            user.setLocation(getLocation(i));
            user.setPassword(UUID.randomUUID().toString());
            user.setSummary("....No Thanks");
            user.setUpdateBy(getCreateBy(user.getId(), i));
            user.setUpdateTime(new Date());
            user.setUsername(getUsername(i));
            users.add(user);
        }
    }

    private static String getAlias(int index) {
        List<String> alias = new ArrayList<>();
        alias.addAll(first_name);
        alias.addAll(last_name);
        Collections.shuffle(alias);
        return alias.get(index % alias.size()).toUpperCase();
    }

    private static String getLocation(int index) {
        Collections.shuffle(location);
        return location.get(index % location.size());
    }

    private static String getGender(int index) {
        Collections.shuffle(gender);
        return gender.get(index % gender.size());
    }

    private static String getEmotionalState(int index) {
        Collections.shuffle(emotional_state);
        return emotional_state.get(index % emotional_state.size());
    }


    private static String getCreateBy(String id, int index) {
        Collections.shuffle(ids);
        return id.equals(ids.get(index % ids.size())) ? ids.get((index + 1)% ids.size()) : ids.get(index % ids.size());
    }

    private static String getId(int index) {
        Collections.shuffle(ids);
        return ids.get(index % ids.size());
    }

    private static String getUsername(int index) {
        Collections.shuffle(first_name);
        Collections.shuffle(last_name);
        return first_name.get(index % first_name.size()) + "." + last_name.get(index % last_name.size());
    }

    private static Date getBirth() {
        return new Calendar.Builder().setDate(new Random().nextInt(2000),
                new Random().nextInt(12), new Random().nextInt(28)).build().getTime();
    }

    public static List<User> findAllUsers() {
        return users;
    }

    public static User findUserById(String id) {
        for (User user: users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public static User findUserByUsername(String username) {
        for (User user: users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> findUserByGender(String gender) {
        List<User> result = new ArrayList<>();
        for (User user: users) {
            if (user.getGender().equals(gender)) {
                result.add(user);
            }
        }
        return result.size() > 0 ? result : null;
    }

    public static boolean insertUser(User user) {
        return users.add(user);
    }

    public static boolean updateUser(User user) {
        if (user != null) {
            User updated = null;
            for (User temp : users) {
                if (temp.getId().equals(user.getId())) {
                    updated = temp;
                    break;
                }
            }
            if (null != updated) {
                users.remove(updated);
                return users.add(user);
            }
        }
        return false;
    }

    public static boolean deleteUser(User user) {
        if (user != null) {
            User deletedUser = null;
            for (User temp : users) {
                if (temp.getId().equals(user.getId())) {
                    deletedUser = temp;
                }
            }
            if (null != deletedUser) {
                return users.remove(deletedUser);
            }
        }
        return false;
    }
}
