package com.hsb.feign.consumer.biz.service;

import com.hsb.feign.api.FeignUserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by heshengbang on 2018/8/30.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@FeignClient(name= "feign-example-producer")
public interface ApiUserService extends FeignUserService {
}
