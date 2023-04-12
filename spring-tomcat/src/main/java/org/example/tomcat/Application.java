package org.example.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application.java
 * 컨테이너와 포트 강의를 위한 project
 *
 * @author 이유나
 * @since 2023.04.12
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
