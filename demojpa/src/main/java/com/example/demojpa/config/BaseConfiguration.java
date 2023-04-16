package com.example.demojpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * BaseConfiguration.java
 * profile을 테스트 하기 위한 class
 *
 * @author 이유나
 * @since 2023.04.16
 */

@Profile("prod")
@Configuration
public class BaseConfiguration {

    @Bean
    public String hello(){
        return "hello~";
    }
}
