package com.hsb.spring.cloud;/**
 * Created by heshengbang on 2018/7/13.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by heshengbang on 2018/7/13.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducerApplication.class, args);
    }
}