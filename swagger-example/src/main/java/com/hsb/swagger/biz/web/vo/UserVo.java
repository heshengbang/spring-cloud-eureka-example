package com.hsb.swagger.biz.web.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Created by heshengbang on 2018/8/28.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Data
@ApiModel("用户实体值对象")
public class UserVo {
    @NotBlank
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("生日")
    private Date burn;
}
