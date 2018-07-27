package com.hsb.spring.cloud.consumer.biz.user.api;

import com.hsb.spring.cloud.api.service.HelloUserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */

@FeignClient(name= "${spring-cloud-producer}")
public interface ApiUserService extends HelloUserService {
}
