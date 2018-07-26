package com.hsb.spring.cloud.user.service.impl;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import com.hsb.spring.cloud.user.service.UserService;
import com.hsb.spring.cloud.util.UserDataUtil;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Created by heshengbang on 2018/7/26.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserVo> findAllUser() {
        return UserDataUtil.findAllUser();
    }

    @Override
    public UserVo findUserByUsername(String username) {
        return UserDataUtil.findUserByUsername(username);
    }

    @Override
    public List<UserVo> findUserByGender(String gender) {
        return UserDataUtil.findUserByGender(gender);
    }

    @Override
    public boolean insertUser(UserDataDto userDataDto) {
        return UserDataUtil.insertUser(userDataDto);
    }

    @Override
    public boolean updateUser(UserDataDto userDataDt) {
        return UserDataUtil.updateUser(userDataDt);
    }

    @Override
    public boolean deleteUser(UserDataDto userDataDt) {
        return UserDataUtil.deleteUser(userDataDt);
    }
}
