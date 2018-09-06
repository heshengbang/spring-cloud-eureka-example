package com.hsb.mybatis.biz.common.util;

import com.github.pagehelper.PageInfo;
import com.hsb.mybatis.biz.common.model.Country;
import com.hsb.mybatis.biz.common.vo.PageVo;

/**
 * Created by heshengbang on 2018/9/6.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
public class CommonUtil {
    public static PageVo<Country> convertPageInfo(PageInfo<Country> pageInfo) {
        PageVo<Country> pageVo = new PageVo<Country>();
        pageVo.setList(pageInfo.getList());
        pageVo.setPageNum(pageInfo.getPageNum());
        pageVo.setPages(pageInfo.getPages());
        pageVo.setPageSize(pageInfo.getPageSize());
        pageVo.setTotal(pageInfo.getTotal());
        return pageVo;
    }
}
