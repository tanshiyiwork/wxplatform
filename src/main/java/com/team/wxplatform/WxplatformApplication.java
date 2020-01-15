package com.team.wxplatform;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;

@Slf4j
@EnableConfigurationProperties
@SpringBootApplication(scanBasePackages="com.team")
public class WxplatformApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(WxplatformApplication.class, args);
        Date startDate = new Date(applicationContext.getStartupDate());
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(IOUtils.LINE_SEPARATOR);
        sBuilder.append(IOUtils.LINE_SEPARATOR).append("服务器已经启动于").append(startDate);
        sBuilder.append(IOUtils.LINE_SEPARATOR);
        sBuilder.append(IOUtils.LINE_SEPARATOR);
        sBuilder.append(IOUtils.LINE_SEPARATOR);

        log.info( sBuilder.toString() );
    }

}
