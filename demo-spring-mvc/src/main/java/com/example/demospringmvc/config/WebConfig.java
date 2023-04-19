package com.example.demospringmvc.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebConfig.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.19
 */
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/m/**") // m으로 시작하는 요청이 오면
                .addResourceLocations("classpath:/m/") // resource안에 있는 m 폴더를 색인
                .setCachePeriod(20);
    }
}
