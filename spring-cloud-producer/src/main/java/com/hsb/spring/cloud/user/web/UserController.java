package com.hsb.spring.cloud.user.web;

import com.hsb.spring.cloud.api.dto.UserDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.util.UserDataUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RestController
@Slf4j
@Api("用户操作web层")
public class UserController {

    @GetMapping("/users")
    @ApiOperation("查找所有的用户")
    public List<UserVo> findAllUser() {
        log.info("======================/users was called");
        return UserDataUtil.findAllUser();
    }

    @GetMapping("/get/${username}")
    @ApiOperation(value = "通过用户名查找用户", notes = "通过用户名查找用户，参数用户名也是路径的一部分")
    public UserVo findUserByUsername(@ApiParam("姓名") @PathVariable("username") String username) {
        log.info("======================/get/${username} was called");
        return UserDataUtil.findUserByUsername(username);
    }


    @GetMapping("/get/findUserByGender")
    @ApiOperation("通过性别查找用户")
    public List<UserVo> findUserByGender(@ApiParam("性别") @RequestParam("gender") String gender) {
        log.info("======================/get/findUserByGender was called");
        return UserDataUtil.findUserByGender(gender);
    }

    @PostMapping("/insertUser")
    @ApiOperation(value = "插入用户", notes = "用户对象为参数")
    public boolean insertUser(@ApiParam("用户实体对象") @RequestBody UserDto userDto) {
        log.info("======================/insertUser was called");
        return UserDataUtil.insertUser(userDto);
    }

    @PutMapping("/updateUser")
    @ApiOperation("修改用户")
    public boolean updateUser(UserDto userDto) {
        log.info("======================/updateUser was called");
        return UserDataUtil.updateUser(userDto);
    }

    @DeleteMapping("/deleteUser")
    @ApiOperation("插入用户")
    public boolean deleteUser(UserDto userDto) {
        log.info("======================/deleteUser was called");
        return UserDataUtil.deleteUser(userDto);
    }
}
