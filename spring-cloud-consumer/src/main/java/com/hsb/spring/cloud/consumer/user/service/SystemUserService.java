package com.hsb.spring.cloud.consumer.user.service;

import com.hsb.spring.cloud.api.dto.UserDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.consumer.user.api.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Service
public class SystemUserService {
    private final UserService userService;

    @Autowired
    public SystemUserService(UserService userService) {
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

    public boolean updateUser(UserDto userDto) {
        return userService.updateUser(userDto);
    }

    public boolean insertUser(UserDto userDto) {
        return userService.insertUser(userDto);
    }

    public boolean deleteUser(UserDto userDto) {
        return userService.deleteUser(userDto);
    }
}
