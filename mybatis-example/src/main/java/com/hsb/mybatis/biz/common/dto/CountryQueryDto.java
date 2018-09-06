package com.hsb.mybatis.biz.common.dto;

import lombok.Data;

/**
 * Created by heshengbang on 2018/9/6.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Data
public class CountryQueryDto {
    private String name;
    private String code;
    private Integer pageNum = 1;
    private Integer pageSize = 10;
}
