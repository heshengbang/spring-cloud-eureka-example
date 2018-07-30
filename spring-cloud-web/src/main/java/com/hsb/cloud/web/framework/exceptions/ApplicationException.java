package com.hsb.cloud.web.framework.exceptions;

import lombok.Data;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/30 9:12
 */
@Data
public class ApplicationException {
    private String code;
    private String message;
}
