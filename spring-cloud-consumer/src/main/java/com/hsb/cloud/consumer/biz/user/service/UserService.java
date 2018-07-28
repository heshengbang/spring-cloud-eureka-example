package com.hsb.cloud.consumer.biz.user.service;

import com.hsb.cloud.api.dto.UserDto;
import com.hsb.cloud.api.vo.UserVo;
import com.hsb.cloud.consumer.biz.user.api.ApiUserService;
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
public class UserService {

    private final ApiUserService apiUserService;

    @Autowired
    public UserService(ApiUserService apiUserService) {
        this.apiUserService = apiUserService;
    }

    public List<UserVo> findAllUser() {
        return apiUserService.findAllUser();
    }

    public UserVo findUserByUsername(String username) {
        return apiUserService.findUserByUsername(username);
    }

    public List<UserVo> findUserByGender(String gender) {
        return apiUserService.findUserByGender(gender);
    }

    public boolean updateUser(UserDto userDto) {
        return apiUserService.updateUser(userDto);
    }

    public boolean insertUser(UserDto userDto) {
        return apiUserService.insertUser(userDto);
    }

    public boolean deleteUser(UserDto userDto) {
        return apiUserService.deleteUser(userDto);
    }

    public UserVo findUserById(String id) {
        return apiUserService.findUserById(id);
    }
}
