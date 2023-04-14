package com.example.demojpa;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class DemojpaApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(DemojpaApplication.class);

        /** banner test */
//        springApplication.setBanner(new Banner() {
//            @Override
//            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//                out.println("=================");
//                out.println("베너 텍스트 파일이 이긴다");
//                out.println("=================");
//            }
//        });
//        springApplication.setBannerMode(Banner.Mode.OFF);

        /** application listener test */
//        springApplication.addListeners(new SampleListener());

        springApplication.setWebApplicationType(WebApplicationType.NONE);

        springApplication.run(args);

        /** SpringApplicationBuilder */
//        new SpringApplicationBuilder()
//                .sources(DemojpaApplication.class)
//                .run(args);
    }

}
