package com.team.wxplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableConfigurationProperties
@SpringBootApplication
public class WxplatformApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(WxplatformApplication.class, args);
    }

}
