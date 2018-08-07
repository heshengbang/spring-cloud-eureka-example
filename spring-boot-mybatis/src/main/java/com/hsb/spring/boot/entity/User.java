package com.hsb.spring.boot.entity;

import java.util.Date;
import lombok.Data;

/**
 * Created by heshengbang on 2018/8/7.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private SexEnum sex;
    private int age;
    private Date born;
}
