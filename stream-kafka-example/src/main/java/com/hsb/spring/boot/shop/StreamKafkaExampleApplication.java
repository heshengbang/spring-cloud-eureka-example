package com.hsb.spring.boot.shop;

import com.hsb.spring.boot.shop.config.ShopChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ShopChannel.class)
public class StreamKafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamKafkaExampleApplication.class, args);
	}
}
