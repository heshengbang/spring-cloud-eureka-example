package com.hsb.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulExampleGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulExampleGatewayApplication.class, args);
	}
}
