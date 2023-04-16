package com.example.demojpa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
//@TestPropertySource(properties = "yuna.name=잉융낭2")
@TestPropertySource(locations = "classpath:/test.properties")
//@SpringBootTest(properties = "yuna.name=잉융낭")
@SpringBootTest
class DemojpaApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("yuna.name")).isEqualTo("잉융낭2");
    }

}
