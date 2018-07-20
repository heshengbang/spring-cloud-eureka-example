package com.hsb.spring.cloud.api.service;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@RequestMapping("/hello")
public interface HelloUserService {

    @ApiOperation(value="查询所有用户信息", notes="测试get方式发送的请求")
    @GetMapping("/users")
    public List<UserVo> findAllUser();

    @ApiOperation(value = "通过用户名查找用户", notes = "传入参数为用户名，返回用户实体对象")
    @GetMapping("/get/{username}")
    public UserVo findUserByUsername(@PathVariable("username") String username);

    @ApiOperation(value = "通过用户性别查找用户", notes = "传入参数为性别，返回性别符合的所有用户")
    // 使用该注解描述方法参数信息，此处需要注意的是paramType参数，需要配置成path，否则在UI中访问接口方法时，会报错
    @ApiImplicitParams({
            @ApiImplicitParam(name = "gender", value = "性别", required = true, dataType = "String", paramType="path")
    })
    @GetMapping("/get/findUserByGender")
    public List<UserVo> findUserByGender(@RequestParam("gender") String gender);

    @ApiOperation(value="添加用户", notes = "传入用户对象")
    @PostMapping("/insertUser")
    public boolean insertUser(@RequestBody UserDataDto userDataDto);

    @ApiOperation(value="修改用户", notes = "传入用户对象")
    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody UserDataDto userDataDt);

    @ApiOperation(value="删除用户", notes = "传入用户对象")
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDataDto userDataDt);
}