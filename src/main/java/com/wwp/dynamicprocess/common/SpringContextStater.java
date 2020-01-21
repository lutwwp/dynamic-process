package com.wwp.dynamicprocess.common;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.ProcessEngine;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * @ClassName SpringContextStater
 * @Description: 容器启动后执行
 * @Author wwp
 * @Date 2020-01-21
 * @Version V1.0
 **/
@Slf4j
@Component
public class SpringContextStater implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        ProcessEngine processEngine = SpringContextHolder.getBean(ProcessEngine.class);
        log.info("processEngine:{}",processEngine);
    }
}
