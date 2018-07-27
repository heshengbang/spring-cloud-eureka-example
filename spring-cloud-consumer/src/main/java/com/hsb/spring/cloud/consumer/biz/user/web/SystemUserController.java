package com.hsb.spring.cloud.consumer.biz.user.web;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.consumer.biz.user.service.SystemUserService;
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
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/system")
@Api(value = "系统用户管理接口", tags = "接口包含通过用户名和性别查找用户，以及常规的增删改查")
public class SystemUserController {
    private final SystemUserService systemUserService;

    @Autowired
    public SystemUserController(SystemUserService systemUserService) {
        this.systemUserService = systemUserService;
    }

    @ApiOperation(value = "查找所有用户", notes = "返回系统中所有的用户")
    @GetMapping("/users")
    public List<UserVo> findAllUser() {
        return systemUserService.findAllUser();
    }

    @ApiOperation(value = "通过用户名去查找用户", notes = "返回用户信息实体对象")
    @GetMapping("/get/{username}")
    public UserVo findUserByUsername(@ApiParam("用户名，参数在请求url路径上") @PathVariable("username") String username) {
        return systemUserService.findUserByUsername(username);
    }

    @GetMapping("/get/findUserByGender")
    @ApiOperation(value = "通过性别查找用户", notes = "查找结果是用户对象集")
    public List<UserVo> findUserByGender(@ApiParam("性别") @RequestParam String gender) {
        return systemUserService.findUserByGender(gender);
    }

    @PutMapping("/updateUser")
    @ApiOperation(value = "更新用户信息", notes = "传入要更新的用户实体对象")
    public boolean updateUser(@ApiParam("要修改的用户实体对象") @RequestBody UserDataDto userDataDto) {
        return systemUserService.updateUser(userDataDto);
    }

    @PostMapping("/insertUser")
    @ApiOperation(value = "插入用户信息", notes = "传入要新增的用户实体对象")
    public boolean insertUser(@ApiParam("要插入的用户实体对象") @RequestBody UserDataDto userDataDto) {
        return systemUserService.insertUser(userDataDto);
    }

    @DeleteMapping("/deleteUser")
    @ApiOperation(value = "删除用户信息", notes = "传入要删除的用户实体对象")
    public boolean deleteUser(@ApiParam("要删除的用户实体对象") @RequestBody UserDataDto userDataDto) {
        return systemUserService.deleteUser(userDataDto);
    }
}
