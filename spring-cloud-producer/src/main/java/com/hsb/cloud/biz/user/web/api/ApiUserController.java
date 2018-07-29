package com.hsb.cloud.biz.user.web.api;

import com.hsb.cloud.api.dto.UserDto;
import com.hsb.cloud.api.service.FeignUserService;
import com.hsb.cloud.api.vo.UserVo;
import com.hsb.cloud.biz.common.model.User;
import com.hsb.cloud.biz.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heshengbang on 2018/7/26.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Api(tags = "用户管理类")
@RestController
public class ApiUserController implements FeignUserService {
    private final UserService userService;

    @Autowired
    public ApiUserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    @ApiOperation("获取所有的用户信息")
    public List<UserVo> findAllUser() {
        List<User> users = userService.findAllUser();
        List<UserVo> result = new ArrayList<>();
        for (User user: users) {
            UserVo temp = convertUserToVo(user);
            if (temp != null) {
                result.add(temp);
            }
        }
        return result;
    }

    private UserVo convertUserToVo(User user) {
        if (user == null || !StringUtils.hasText(user.getId())) {
            return null;
        }
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setUsername(user.getUsername());
        userVo.setGender(user.getGender());
        userVo.setAge(user.getAge());
        userVo.setAlias(user.getAlias());
        userVo.setBirth(user.getBirth());
        userVo.setEmotional_state(user.getEmotional_state());
        userVo.setLocation(user.getLocation());
        userVo.setSummary(user.getSummary());
        return userVo;
    }

    @Override
    @ApiOperation(value = "通过用户名查找用户", notes = "传入参数为用户名，返回用户实体对象")
    public UserVo findUserByUsername(@ApiParam(value = "用户名参数", required = true) @RequestParam("username") String username) {
        User user = userService.findUserByUsername(username);
        return convertUserToVo(user);
    }

    @Override
    @ApiOperation(value = "通过用户id查找用户", notes = "传入参数为用户id，返回用户实体对象")
    public UserVo findUserById(@ApiParam(value = "用户id", required = true) @RequestParam("id") String id) {
        return convertUserToVo(userService.findUserById(id));
    }

    @Override
    @ApiOperation(value = "通过用户性别查找用户", notes = "传入参数为性别，返回性别符合的所有用户")
    // 使用该注解描述方法参数信息，此处需要注意的是paramType参数，需要配置成path，否则在UI中访问接口方法时，会报错
    @ApiImplicitParams({
            @ApiImplicitParam(name = "gender", value = "性别", required = true, dataType = "String", paramType="path")
    })
    public List<UserVo> findUserByGender(@ApiParam(value = "性别参数", required = true) @RequestParam String gender) {
        List<User> users = userService.findUserByGender(gender);
        List<UserVo> result = new ArrayList<>();
        for (User user: users) {
            UserVo temp = convertUserToVo(user);
            if (temp != null) {
                result.add(temp);
            }
        }
        return result;
    }

    @Override
    @ApiOperation("插入用户信息")
    public boolean insertUser(@Valid @ApiParam("待插入的用户信息") @RequestBody UserDto userDto) {
        User user = convertDtoToModel(userDto);
        return userService.insertUser(user);
    }

    private User convertDtoToModel(UserDto userDto) {
        if (userDto == null || !StringUtils.hasText(userDto.getId())) {
            return null;
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setUpdateTime(userDto.getUpdateTime());
        user.setUpdateBy(userDto.getUpdateBy());
        user.setSummary(userDto.getSummary());
        user.setPassword(userDto.getPassword());
        user.setLocation(userDto.getLocation());
        user.setGender(userDto.getGender());
        user.setEmotional_state(userDto.getEmotional_state());
        user.setCreateTime(userDto.getCreateTime());
        user.setCreateBy(userDto.getCreateBy());
        user.setBirth(userDto.getBirth());
        user.setAlias(userDto.getAlias());
        user.setAge(userDto.getAge());
        return user;
    }

    @Override
    @ApiOperation("更新用户信息")
    public boolean updateUser(@Valid @ApiParam("待更新的用户信息") @RequestBody UserDto userDto) {
        User user = convertDtoToModel(userDto);
        return userService.updateUser(user);
    }

    @Override
    @ApiOperation("删除用户")
    public boolean deleteUser(@Valid @ApiParam("待删除的用户信息") @RequestBody UserDto userDto) {
        User user = convertDtoToModel(userDto);
        return userService.deleteUser(user);
    }
}
