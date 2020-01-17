package com.team.wxplatform;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author tsy
 * @time 2020-1-16 9:40
 */
@Slf4j
public class LogbackTest extends WxplatformApplicationTests{

    @Test
    public void testLog() {
        System.out.println("out put log file");
        log.info("logback 成功了");
        log.error("logback 成功了");
        log.debug("logback 成功了");
    }
}
