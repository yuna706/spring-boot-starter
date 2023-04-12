package com.example.springhttpstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHttpStudyApplication {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHttpStudyApplication.class, args);
    }


//    ======== 아파치 톰캣 내부에 있는 라이브러리라서 주석 처리 ========
//    @Bean
//    public ServletWebServerFactory serverFactory() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createDtandardConnector());
//        return tomcat;
//    }

//    http 통신으로 연결하는 커넥터
//    private Connector createDtandardConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(8080);
//        return connector;
//    }

}
