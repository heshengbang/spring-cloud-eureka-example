package com.hsb.cloud.consumer.biz.user.web;

import com.hsb.cloud.api.dto.UserDto;
import com.hsb.cloud.api.vo.UserVo;
import com.hsb.cloud.consumer.biz.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@RestController
@Api(value = "系统用户管理接口", tags = "接口包含通过用户名和性别查找用户，以及常规的增删改查")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "查找所有用户", notes = "返回系统中所有的用户")
    @GetMapping("/users")
    public List<UserVo> findAllUser() {
        return userService.findAllUser();
    }

    @ApiOperation("根据id获取用户信息")
    @GetMapping("/users/{id}")
    public UserVo findUserById(@ApiParam("id参数") @PathVariable("id") String id) {
        return userService.findUserById(id);
    }

    @ApiOperation(value = "通过用户名去查找用户", notes = "返回用户信息实体对象")
    @GetMapping("/users/findUserByUsername")
    public UserVo findUserByUsername(@ApiParam("用户名，参数在请求url路径上") @RequestParam("username") String username) {
        return userService.findUserByUsername(username);
    }

    @GetMapping("/users/findUserByGender")
    @ApiOperation(value = "通过性别查找用户", notes = "查找结果是用户对象集")
    public List<UserVo> findUserByGender(@ApiParam("性别") @RequestParam String gender) {
        return userService.findUserByGender(gender);
    }

    @PutMapping("/updateUser")
    @ApiOperation(value = "更新用户信息", notes = "传入要更新的用户实体对象")
    public boolean updateUser(@ApiParam("要修改的用户实体对象") @RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @PostMapping("/insertUser")
    @ApiOperation(value = "插入用户信息", notes = "传入要新增的用户实体对象")
    public boolean insertUser(@ApiParam("要插入的用户实体对象") @RequestBody UserDto userDto) {
        return userService.insertUser(userDto);
    }

    @DeleteMapping("/deleteUser")
    @ApiOperation(value = "删除用户信息", notes = "传入要删除的用户实体对象")
    public boolean deleteUser(@ApiParam("要删除的用户实体对象") @RequestBody UserDto userDto) {
        return userService.deleteUser(userDto);
    }
}
