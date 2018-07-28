package com.hsb.cloud.api.service;

import com.hsb.cloud.api.dto.UserDto;
import com.hsb.cloud.api.vo.UserVo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */

public interface FeignUserService {

    @GetMapping("/users")
    List<UserVo> findAllUser();

    @GetMapping("/users/findUserByUsername")
    UserVo findUserByUsername(@RequestParam("username") String username);

    @GetMapping("/users/{id}")
    UserVo findUserById(@PathVariable("id") String id);

    @GetMapping("/users/findUserByGender")
    List<UserVo> findUserByGender(@RequestParam("gender") String gender);

    @PostMapping("/insertUser")
    boolean insertUser(@RequestBody UserDto userDto);

    @PutMapping("/updateUser")
    boolean updateUser(@RequestBody UserDto userDto);

    @DeleteMapping("/deleteUser")
    boolean deleteUser(@RequestBody UserDto userDto);
}