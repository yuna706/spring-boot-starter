package com.yuna.whiteship;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HolomanConfiguration.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.11
 */

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    public Holoman holoman(HolomanProperties prop){
        Holoman holoman = new Holoman();
        holoman.setHowLong(prop.getHowLong());
        holoman.setName(prop.getName());
        return holoman;
    }
}
