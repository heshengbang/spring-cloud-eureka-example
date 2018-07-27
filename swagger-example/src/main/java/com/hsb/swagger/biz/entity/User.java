package com.hsb.swagger.biz.entity;

import lombok.Data;

import java.util.Date;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/27 17:28
 */
@Data
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

    // Getter Setter
}