package com.example.demojpa;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * YunaPropperties.java
 * 프로퍼티를 받는 클래스
 *
 * @author 이유나
 * @since 2023.04.14
 */
@Component
@Validated
@ConfigurationProperties("yuna")
public class YunaProperties {
    @NonNull
    private String name;
    private int age;
    private String fullName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
