package com.hsb.feign.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignExampleProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignExampleProducerApplication.class, args);
	}
}
