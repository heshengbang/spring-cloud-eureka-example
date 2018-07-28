package com.hsb.cloud.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by heshengbang on 2018/7/20.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Data
@ApiModel
public class UserDataDto {
    @ApiModelProperty("社会统一标示号")
    private String socialId;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("出生时间")
    private Date burn;
}
