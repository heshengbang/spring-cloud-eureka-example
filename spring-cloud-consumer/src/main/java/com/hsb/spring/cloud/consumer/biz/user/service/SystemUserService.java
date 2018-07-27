package com.hsb.spring.cloud.consumer.biz.user.service;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.consumer.biz.user.api.ApiUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Service
@Slf4j
public class SystemUserService {

    private final ApiUserService userService;

    @Autowired
    public SystemUserService(ApiUserService userService) {
        this.userService = userService;
    }

    public List<UserVo> findAllUser() {
        return userService.findAllUser();
    }

    public UserVo findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }

    public List<UserVo> findUserByGender(String gender) {
        return userService.findUserByGender(gender);
    }

    public boolean updateUser(UserDataDto userDataDto) {
        return userService.updateUser(userDataDto);
    }

    public boolean insertUser(UserDataDto userDataDto) {
        return userService.insertUser(userDataDto);
    }

    public boolean deleteUser(UserDataDto userDataDto) {
        return userService.deleteUser(userDataDto);
    }
}
