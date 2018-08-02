package com.hsb.security.oAuthexample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/2 13:57
 */

@Configuration
@EnableResourceServer
@Slf4j
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private final CustomAuthenticationEntryPoint customAuthenticationEntryPoint ;

    @Autowired
    public ResourceServerConfiguration(CustomAuthenticationEntryPoint customAuthenticationEntryPoint) {
        this.customAuthenticationEntryPoint = customAuthenticationEntryPoint;
    }

    @Bean
    public CustomLogoutSuccessHandler customLogoutSuccessHandler(){
        return new CustomLogoutSuccessHandler();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        log.info("=========================111111111=========");
        http.exceptionHandling()
                .authenticationEntryPoint(customAuthenticationEntryPoint)
                .and()
                .logout()
                .logoutUrl("/oauth/logout")
                .logoutSuccessHandler(customLogoutSuccessHandler())
                .and()
                .authorizeRequests()
                .antMatchers("/hello/").permitAll()
                .antMatchers("/secure/**").authenticated();
    }
}