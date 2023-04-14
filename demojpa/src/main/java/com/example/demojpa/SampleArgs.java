package com.example.demojpa;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * SampleArgs.java
 * application arguments 사용하기
 *
 * @author 이유나
 * @since 2023.04.13
 */
@Component
public class SampleArgs {
    public SampleArgs(ApplicationArguments arguments){
        System.out.println("foo: " + arguments.containsOption("foo"));
        System.out.println("bar: " + arguments.containsOption("bar"));
    }
}
