package com.hsb.spring.cloud.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Data
@ApiModel
public class UserDto {
        @ApiModelProperty("社会统一标示号")
        private String socialId;
        @ApiModelProperty("用户名")
        private String username;
        @ApiModelProperty("性别")
        private String gender;
}
