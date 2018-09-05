package com.hsb.mybatis.biz.web;

import com.hsb.mybatis.biz.common.model.Country;
import com.hsb.mybatis.biz.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/9/5 13:39
 */
@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/condition")
    public List<Country> getByCondition(@RequestParam("nameOrCode") String nameOrCode) {
        return countryService.getByCondition(nameOrCode);
    }

    @GetMapping("/{name}")
    public Country getByName(@PathVariable("name") String name) {
        return countryService.getByName(name);
    }

    @GetMapping
    public List<Country> getAll() {
        return countryService.getAll();
    }

    @PostMapping
    public int insertOne(@RequestBody Country country) {
        return countryService.insertOne(country);
    }

    @PutMapping
    public int updateOne(@RequestBody Country country) {
        return countryService.updateOne(country);
    }

    @DeleteMapping
    public int deleteOne(@RequestBody Country country) {
        return countryService.deleteOne(country);
    }
}
