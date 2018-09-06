package com.hsb.mybatis.biz.common.vo;

import java.util.List;
import lombok.Data;

/**
 * Created by heshengbang on 2018/9/6.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@Data
public class PageVo<T> {
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //总页数
    private int pages;
    //总记录数
    protected long total;
    //结果集
    protected List<T> list;
}
