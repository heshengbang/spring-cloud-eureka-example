package com.hsb.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/7/30 18:41
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceZuulApplication.class, args);
    }

    @Bean
    public PatternServiceRouteMapper serviceRouteMapper(){
        // servicePattern: 指的是微服务的pattern
        // routePattern: 指的是路由的pattern
        // 当你访问/microservice-provider-user/v1 其实就是
        // localhost:8040/v1/microservice-provider-user/user/1

        return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)","${version}/${name}");
    }
}
