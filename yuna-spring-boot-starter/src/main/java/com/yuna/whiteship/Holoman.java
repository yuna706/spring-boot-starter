package com.yuna.whiteship;

/**
 * Holoman.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.11
 */
public class Holoman {
    String name;
    int howLong;

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Holoman{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                '}';
    }
}
