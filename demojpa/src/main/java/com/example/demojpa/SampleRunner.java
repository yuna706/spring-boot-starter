package com.example.demojpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * SampleRunner.java
 * 애플리케이션이 실행되고 실행하는 클래스
 *
 * @author 이유나
 * @since 2023.04.14
 */
@Component
public class SampleRunner implements ApplicationRunner {
//    @Value("${yuna.name}")
//    private String name;
//
//    @Value("${yuna.age}")
//    private int age;

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);
    
    @Autowired
    private String hello;

    @Autowired
    private YunaProperties yunaProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("+++++++++++++++");
        logger.info(hello);
        logger.info(yunaProperties.getName());
        logger.info(yunaProperties.getFullName());
        logger.info("+++++++++++++++");
    }
}
