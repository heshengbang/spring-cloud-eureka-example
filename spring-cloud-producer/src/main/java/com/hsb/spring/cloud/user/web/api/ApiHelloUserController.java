package com.hsb.spring.cloud.user.web.api;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.service.HelloUserService;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.user.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/7/26.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
public class ApiHelloUserController implements HelloUserService {
    private final UserService userService;

    @Autowired
    public ApiHelloUserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserVo> findAllUser() {
        return userService.findAllUser();
    }

    @Override
    public UserVo findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }

    @Override
    public List<UserVo> findUserByGender(String gender) {
        return userService.findUserByGender(gender);
    }

    @Override
    public boolean insertUser(UserDataDto userDataDto) {
        return userService.insertUser(userDataDto);
    }

    @Override
    public boolean updateUser(UserDataDto userDataDt) {
        return userService.updateUser(userDataDt);
    }

    @Override
    public boolean deleteUser(UserDataDto userDataDt) {
        return userService.deleteUser(userDataDt);
    }
}
