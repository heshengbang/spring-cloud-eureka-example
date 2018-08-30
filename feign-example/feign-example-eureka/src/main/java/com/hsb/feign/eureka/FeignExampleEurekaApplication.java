package com.hsb.feign.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启用服务注册服务
@EnableEurekaServer
public class FeignExampleEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignExampleEurekaApplication.class, args);
	}
}
