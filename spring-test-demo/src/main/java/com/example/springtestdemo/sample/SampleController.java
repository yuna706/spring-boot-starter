package com.example.springtestdemo.sample;

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

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hello")
    public String hello(){
        return "hello " + sampleService.getName();
    }
}
