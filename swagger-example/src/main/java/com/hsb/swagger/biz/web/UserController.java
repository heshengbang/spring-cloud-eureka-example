package com.hsb.swagger.biz.web;

import com.hsb.swagger.biz.entity.User;
import com.hsb.swagger.biz.web.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/27 16:48
 */
@Slf4j
@Api(tags = "用户管理类（测试swagger）")
@RestController
@RequestMapping("/users")
public class UserController {
    // 创建线程安全的Map
    private static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<>());

    /**
     * 根据ID查询用户
     * @param id 用户id
     * @return 用户值对象
     */
    @ApiOperation(value="根据id获取用户对象", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @GetMapping(value = "/{id}")
    public UserVo getUserById (@ApiParam("用户id") @PathVariable(value = "id") Integer id){
        User user = users.get(id);
        if (null == user) {
            return null;
        }
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        return userVo;
    }

    /**
     * 根据id集合批量查用户
     * @param ids id集合
     * @return 用户值对象集合
     */
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @GetMapping(value = "/")
    public List<UserVo> getBatchByUsername(@ApiParam("id集合") @RequestParam("ids") List<String> ids) throws Exception {

        if (CollectionUtils.isEmpty(ids)) {
            throw new Exception("参数为空集合");
        }
        List<UserVo> userVos = new ArrayList<>(ids.size());
        ids.forEach(id -> {
            User user = users.get(Integer.valueOf(id));
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(user, userVo);
            userVos.add(userVo);
        });
        return userVos;
    }

    /**
     * 查询用户列表
     * @return 用户值对象列表
     */
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @GetMapping(value = "/getAll/")
    public List<UserVo> getUserList (){
        List<User> userList = new ArrayList<>(users.values());
        List<UserVo> userVos = new ArrayList<>(userList.size());
        userList.forEach(user -> {
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(user, userVo);
            userVos.add(userVo);
        });
        return userVos;
    }

    /**
     * 添加用户
     * @param userVo 用户只对象
     * @return 添加结果
     */
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @PostMapping(value = "/")
    public boolean add (@RequestBody @NotNull UserVo userVo){
        User user = new User();
        BeanUtils.copyProperties(userVo, user);
        int id = new Random().nextInt(1000);
        while (users.containsKey(id)) {
            id = new Random().nextInt(1000);
        }
        user.setId(id);
        users.put(id, user);
        return Boolean.TRUE;
    }

    /**
     * 根据id删除用户
     * @param id 用户id
     * @return 结果
     */
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @DeleteMapping(value = "/{id}")
    public boolean delete (@ApiParam("用户id") @PathVariable(value = "id") Integer id){
        if (users.containsKey(id)) {
            users.remove(id);
            return Boolean.TRUE;
        } else {
            log.error("用户id不存在");
            return Boolean.FALSE;
        }
    }

    /**
     * 根据id修改用户信息
     * @param userVo 待修改的用户只对象
     * @return 修改结果
     */
    @ApiOperation(value="更新信息", notes="根据url的id来指定更新用户信息")
    @PutMapping(value = "/{id}")
    public boolean update (@ApiParam("用户id") @PathVariable("id") Integer id, @ApiParam("用户值对象")  @RequestBody UserVo userVo){
        if (!users.containsKey(id)) {
            log.error("用户id不存在");
            return Boolean.FALSE;
        }
        User user = new User();
        BeanUtils.copyProperties(userVo, user);
        user.setId(id);
        users.remove(id);
        users.put(id, user);
        return Boolean.TRUE;
    }

    @ApiIgnore//使用该注解忽略这个API
    @GetMapping(value = "/hi")
    public String  jsonTest() {
        return " hi you!";
    }
}