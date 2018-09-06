package com.hsb.mybatis.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hsb.mybatis.biz.common.dto.CountryQueryDto;
import com.hsb.mybatis.biz.common.model.Country;
import com.hsb.mybatis.biz.common.util.CommonUtil;
import com.hsb.mybatis.biz.common.vo.PageVo;
import com.hsb.mybatis.biz.dao.CountryMapper;
import com.hsb.mybatis.biz.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

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

    @Override
    public PageVo<Country> getWithPage(CountryQueryDto countryQueryDto) {
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(countryQueryDto.getPageNum(), countryQueryDto.getPageSize());

        Example example = new Example(Country.class);
        Example.Criteria criteria = example.createCriteria();
        if(StringUtils.hasText(countryQueryDto.getName())){
            criteria.andLike("countryName", "%" + countryQueryDto.getName() + "%");
        }
        if(StringUtils.hasText(countryQueryDto.getCode())){
            criteria.andLike("countryCode", "%" + countryQueryDto.getCode() + "%");
        }
        List<Country> countries = countryMapper.selectByExample(example);

        //用PageInfo对结果进行包装
        return CommonUtil.convertPageInfo(new PageInfo<>(countries));
    }
}
