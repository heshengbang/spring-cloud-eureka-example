package com.hsb.mybatis.biz.service;

import com.hsb.mybatis.biz.common.dto.CountryQueryDto;
import com.hsb.mybatis.biz.common.model.Country;
import com.hsb.mybatis.biz.common.vo.PageVo;
import java.util.List;

/**
 * @author heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/9/5 13:26
 */

public interface CountryService {
    List<Country> getByCondition(String nameOrCode);

    Country getByName(String name);

    List<Country> getAll();

    int insertOne(Country country);

    int updateOne(Country country);

    int deleteOne(Country country);

    PageVo<Country> getWithPage(CountryQueryDto countryQueryDto);
}
