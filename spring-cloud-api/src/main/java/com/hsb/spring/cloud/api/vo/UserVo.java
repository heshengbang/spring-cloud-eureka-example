package com.hsb.spring.cloud.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Data
@ApiModel
public class UserVo {
    @ApiModelProperty("社会统一标示号")
    private String socialId;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("出生时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date burn;
}
