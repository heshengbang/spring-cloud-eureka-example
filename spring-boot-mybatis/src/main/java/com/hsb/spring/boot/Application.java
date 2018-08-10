package com.hsb.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by heshengbang on 2018/8/7.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
@SpringBootApplication
@MapperScan("com.hsb.spring.boot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
