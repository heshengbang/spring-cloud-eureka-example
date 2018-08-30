package com.hsb.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients(basePackages = {"com.hsb.feign.consumer.biz.service"})
public class FeignExampleConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignExampleConsumerApplication.class, args);
	}
}
