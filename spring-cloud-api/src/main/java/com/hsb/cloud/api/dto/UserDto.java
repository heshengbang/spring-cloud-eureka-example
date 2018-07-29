package com.hsb.cloud.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Data
@ApiModel("用户数据传输对象")
public class UserDto {
        @ApiModelProperty("数据库众存放的id")
        @NotBlank
        private String id;
        @ApiModelProperty("用户名")
        @Pattern(regexp = "[A-Za-z/.]", message = "用户名不符合规范")
        private String username;
        @Pattern(regexp = "[A-Z]", message = "昵称不符合规范")
        @ApiModelProperty("用户昵称")
        private String alias;
        @ApiModelProperty("性别")
        private String gender;
        @ApiModelProperty("年龄")
        @Max(value = 130, message = "据现代医学研究表明，130岁是现代智人的年龄极限")
        @Min(value = 0, message = "年龄不算虚岁")
        private int age;
        @ApiModelProperty("出生年月")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date birth;
        @ApiModelProperty("密码")
        private String password;
        @ApiModelProperty("个人简介")
        private String summary;
        @ApiModelProperty("感情状况")
        private String emotional_state;
        @ApiModelProperty("所在地")
        private String location;
        @ApiModelProperty("账户创建时间")
        private Date createTime;
        @ApiModelProperty("账户创建人")
        private String createBy;
        @ApiModelProperty("账户更新时间")
        private Date updateTime;
        @ApiModelProperty("账户更新人")
        private String updateBy;
}
