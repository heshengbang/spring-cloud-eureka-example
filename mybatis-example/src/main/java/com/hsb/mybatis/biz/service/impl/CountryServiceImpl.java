package com.hsb.mybatis.biz.service.impl;

import com.hsb.mybatis.biz.common.model.Country;
import com.hsb.mybatis.biz.dao.CountryMapper;
import com.hsb.mybatis.biz.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/9/5 13:29
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> getByCondition(String nameOrCode) {
        Example example = new Example(Country.class);
        example.setForUpdate(true);
        example.createCriteria().orEqualTo("countryName", nameOrCode)
                .orEqualTo("countryCode", nameOrCode);
        return countryMapper.selectByExample(example);
    }

    @Override
    public Country getByName(String name) {
        Example example = new Example(Country.class);
        example.setForUpdate(true);
        example.createCriteria().andEqualTo("countryName", name);
        return countryMapper.selectOneByExample(example);
    }

    @Override
    public List<Country> getAll() {
        return countryMapper.selectAll();
    }

    @Override
    public int insertOne(Country country) {
        return countryMapper.insertSelective(country);
    }

    @Override
    public int updateOne(Country country) {
        return countryMapper.updateByPrimaryKey(country);
    }

    @Override
    public int deleteOne(Country country) {
        return countryMapper.delete(country);
    }
}
