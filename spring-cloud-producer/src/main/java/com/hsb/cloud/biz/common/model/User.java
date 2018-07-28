package com.hsb.cloud.biz.common.model;

import lombok.Data;

import java.util.Date;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/28 16:33
 */
@Data
public class User {
    private String id;
    private String username;
    private String alias;
    private String gender;
    private int age;
    private Date birth;
    private String password;
    private String summary;
    private String emotional_state;
    private String location;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
}
