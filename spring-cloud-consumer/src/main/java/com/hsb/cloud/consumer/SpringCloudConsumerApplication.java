package com.hsb.cloud.consumer;/**
 * Created by heshengbang on 2018/7/13.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by heshengbang on 2018/7/13.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@SpringBootApplication
//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients(basePackages = {"com.hsb.cloud.consumer.biz.user"})
public class SpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }
}