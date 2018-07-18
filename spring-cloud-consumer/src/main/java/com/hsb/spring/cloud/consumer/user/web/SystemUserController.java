package com.hsb.spring.cloud.consumer.user.web;

import com.hsb.spring.cloud.api.dto.UserDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.consumer.user.service.SystemUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Controller
@RequestMapping("/system")
public class SystemUserController {
    private final SystemUserService systemUserService;

    @Autowired
    public SystemUserController(SystemUserService systemUserService) {
        this.systemUserService = systemUserService;
    }

    @GetMapping("/user/findAllUser")
    public List<UserVo> findAllUser() {
        return systemUserService.findAllUser();
    }

    @GetMapping("/user/findUserByUsername")
    public UserVo findUserByUsername(String username) {
        return systemUserService.findUserByUsername(username);
    }

    @GetMapping("/user/findUserByGender")
    public List<UserVo> findUserByGender(String gender) {
        return systemUserService.findUserByGender(gender);
    }

    @GetMapping("/user/updateUser")
    public boolean updateUser(UserDto userDto) {
        return systemUserService.updateUser(userDto);
    }

    @GetMapping("/user/insertUser")
    public boolean insertUser(UserDto userDto) {
        return systemUserService.insertUser(userDto);
    }

    @GetMapping("/user/deleteUser")
    public boolean deleteUser(UserDto userDto) {
        return systemUserService.deleteUser(userDto);
    }
}
