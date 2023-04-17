package com.example.springtestdemo.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * SampleController.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.17
 */
@Controller
public class SampleController {

    Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hello")
    public String hello(){
        logger.info("yuna lee test");
        System.out.println("yuna lee test");
        return "hello " + sampleService.getName();
    }
}
