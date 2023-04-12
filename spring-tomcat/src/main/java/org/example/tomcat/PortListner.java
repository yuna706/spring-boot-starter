package org.example.tomcat;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * PortListner.java
 * 서버 포트를 알기 위한 클래스
 *
 * @author 이유나
 * @since 2023.04.12
 */
@Component
public class PortListner implements ApplicationListener<ServletWebServerInitializedEvent> {
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
        ServletWebServerApplicationContext applicationContext = servletWebServerInitializedEvent.getApplicationContext();

        System.out.println(applicationContext.getWebServer().getPort());
    }
}
