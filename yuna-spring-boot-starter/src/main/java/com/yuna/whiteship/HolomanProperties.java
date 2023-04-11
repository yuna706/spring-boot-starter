package com.yuna.whiteship;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HolomanProperties.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.11
 */
@ConfigurationProperties("holoman")
public class HolomanProperties {
    private String name;
    private int howLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }
}
