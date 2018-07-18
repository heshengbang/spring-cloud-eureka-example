package com.hsb.spring.cloud.user.web;

import com.hsb.spring.cloud.api.dto.UserDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.util.UserDataUtil;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
@RefreshScope
@Slf4j
public class UserController {

    @GetMapping("/hello/user/findAllUser")
    public List<UserVo> findAllUser() {
        log.info("======================/hello/user/findAllUser was called");
        return UserDataUtil.findAllUser();
    }

    @GetMapping("/hello/user/findUserByUsername")
    public UserVo findUserByUsername(String username) {
        log.info("======================/hello/user/findUserByUsername was called");
        return UserDataUtil.findUserByUsername(username);
    }


    @GetMapping("/hello/user/findUserByGender")
    public List<UserVo> findUserByGender(String gender) {
        log.info("======================/hello/user/findUserByGender was called");
        return UserDataUtil.findUserByGender(gender);
    }

    @PostMapping("/hello/user/insertUser")
    public boolean insertUser(UserDto userDto) {
        log.info("======================/hello/user/insertUser was called");
        return UserDataUtil.insertUser(userDto);
    }

    @PostMapping("/hello/user/updateUser")
    public boolean updateUser(UserDto userDto) {
        log.info("======================/hello/user/updateUser was called");
        return UserDataUtil.updateUser(userDto);
    }

    @PostMapping("/hello/user/deleteUser")
    public boolean deleteUser(UserDto userDto) {
        log.info("======================/hello/user/deleteUser was called");
        return UserDataUtil.deleteUser(userDto);
    }
}
