package com.hsb.spring.boot.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/10 9:19
 */

public class User implements Serializable {
    private String username;
    private String password;
    private int age;
    private Date born;

    public User(String username, String password, int age, Date born) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.born = born;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
}
