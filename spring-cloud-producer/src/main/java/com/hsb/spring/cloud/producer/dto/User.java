package com.hsb.spring.cloud.producer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by heshengbang on 2018/7/14.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private String username;
    private String gender;
}