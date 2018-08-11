package com.hsb.spring.boot.web;

import com.hsb.spring.boot.entity.Role;
import com.hsb.spring.boot.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    private final RoleMapper roleMapper;

    @Autowired
    public RoleController(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @GetMapping("/roles")
    public List<Role> selectAll() {
      return roleMapper.selectAll();
    }

    @GetMapping("/{id}")
    public Role selectRoleById(@PathVariable Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @DeleteMapping("/{id}")
    public int deleteRole(@PathVariable Long id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @PutMapping("/update")
    public int updateRole(@RequestBody Role role) {
        return roleMapper.updateByPrimaryKey(role);
    }

    @PostMapping("/insert")
    public int insertRole(@RequestBody Role role) {
        return roleMapper.insert(role);
    }
}
