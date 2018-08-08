package com.hsb.spring.boot.web;

import com.hsb.spring.boot.entity.Role;
import com.hsb.spring.boot.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/8 11:22
 */

@RestController
public class RoleController {
    @Autowired
    private RoleMapper roleMapper;

    @GetMapping("/roles")
    List<Role> selectAll() {
      return roleMapper.selectAll();
    }

    @GetMapping("/roles/{id}")
    Role selectRoleById(@PathVariable("id") Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }
}
