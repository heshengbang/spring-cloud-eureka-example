package com.hsb.spring.cloud.user.service;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import java.util.List;

/**
 * Created by heshengbang on 2018/7/26.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
public interface UserService {
    public List<UserVo> findAllUser();
    public UserVo findUserByUsername(String username);
    public List<UserVo> findUserByGender(String gender);
    public boolean insertUser(UserDataDto userDataDto);
    public boolean updateUser(UserDataDto userDataDt);
    public boolean deleteUser(UserDataDto userDataDt);
}
