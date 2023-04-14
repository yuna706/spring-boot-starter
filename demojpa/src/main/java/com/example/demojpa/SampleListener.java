package com.example.demojpa;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * SampleListener.java
 * application context가 만들어지기 이전에 발생하는 이벤트에 대한 실행 동작
 *
 * @author 이유나
 * @since 2023.04.13
 */
//@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("=======================");
        System.out.println("Application is started");
        System.out.println("=======================");
    }
}
