package com.hsb.spring.cloud.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Data
@ApiModel
public class UserVo {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("出生时间")
    private Date burn;
}
