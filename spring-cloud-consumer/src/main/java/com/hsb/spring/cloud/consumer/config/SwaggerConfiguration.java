package com.hsb.spring.cloud.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by heshengbang on 2018/7/14.
 * https://github.com/heshengbang
 * www.heshengbang.tech
 * email: trulyheshengbang@gmail.com
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createApi() {// 创建API基本信息
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
                .apis(RequestHandlerSelectors.basePackage("com.hsb.spring.cloud.consumer.biz.user"))
                .paths(PathSelectors.any())
                .build();
    }

    // 创建API的基本信息，这些信息会在Swagger UI中进行显示
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // API 标题
                .title("前端使用接口列表")
                // API描述
                .description("提供给前端使用的接口信息")
                .license("MIT")
                .licenseUrl("www.heshengbang.tech")
                // 联系人
                .contact("trulyheshengbang@gmail.com")
                // 版本号
                .version("1.0")
                .build();
    }
}