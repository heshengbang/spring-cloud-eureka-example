package com.hsb.cloud.consumer.biz.user.api;

import com.hsb.cloud.api.service.FeignUserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by heshengbang on 2018/7/18.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */

@FeignClient(name= "${spring-cloud-producer}")
public interface ApiUserService extends FeignUserService {
}
