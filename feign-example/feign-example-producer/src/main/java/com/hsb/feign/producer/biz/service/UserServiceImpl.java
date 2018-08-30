package com.hsb.feign.producer.biz.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by heshengbang on 2018/8/30.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(String id) {
        if (StringUtils.hasText(id)) {
            return "id的名字";
        } else {
            return "id为空，拿不到名字";
        }
    }
}
