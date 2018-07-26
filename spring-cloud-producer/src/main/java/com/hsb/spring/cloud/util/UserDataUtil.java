package com.hsb.spring.cloud.util;

import com.hsb.spring.cloud.api.dto.UserDataDto;
import com.hsb.spring.cloud.api.vo.UserVo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
public class UserDataUtil {

    public static List<UserVo> findAllUser() {
        UserVo userVo = new UserVo();
        userVo.setSocialId(UUID.randomUUID().toString());
        userVo.setUsername("heshengbang");
        userVo.setGender("male");
        userVo.setAddress("ChengDu");
        userVo.setBurn(new Date());


        UserVo userVo1 = new UserVo();
        userVo1.setSocialId("123456789");
        userVo1.setUsername("heshengbang1");
        userVo1.setGender("male1");
        userVo1.setAddress("ChengDu1");
        userVo1.setBurn(new Date());


        UserVo userVo2 = new UserVo();
        userVo2.setSocialId(UUID.randomUUID().toString());
        userVo2.setUsername("liushishi");
        userVo2.setGender("famale");
        userVo2.setAddress("ChengDu2");
        userVo2.setBurn(new Date());

        List<UserVo> list = new ArrayList<>(3);
        list.add(userVo);
        list.add(userVo1);
        list.add(userVo2);

        return list;
    }

     
    public static UserVo findUserByUsername(String username) {

        UserVo userVo = new UserVo();
        userVo.setUsername("heshengbang");
        userVo.setGender("male");
        userVo.setAddress("ChengDu");
        userVo.setBurn(new Date());
        return userVo;
    }

     
    public static List<UserVo> findUserByGender(String gender) {
        UserVo userVo = new UserVo();
        userVo.setUsername("heshengbang");
        userVo.setGender("male");
        userVo.setAddress("ChengDu");
        userVo.setBurn(new Date());


        UserVo userVo1 = new UserVo();
        userVo1.setUsername("heshengbang1");
        userVo1.setGender("male1");
        userVo1.setAddress("ChengDu1");
        userVo1.setBurn(new Date());


        List<UserVo> list = new ArrayList<>(3);
        list.add(userVo);
        list.add(userVo1);

        return list;
    }

     
    public static boolean insertUser(UserDataDto userDataDto) {
        return true;
    }

     
    public static boolean updateUser(UserDataDto userDataDto) {
        return true;
    }

     
    public static boolean deleteUser(UserDataDto userDataDto) {
        return false;
    }
}
