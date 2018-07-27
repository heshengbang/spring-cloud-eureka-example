package com.hsb.swagger.biz.entity;

import lombok.Data;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/27 17:27
 */
@Data
public class JsonResult {

    private String status = null;

    private Object result = null;

}