package com.yuna;

import com.yuna.whiteship.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * HolomanRunner.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.11
 */
@Component
public class HolomanRunner implements ApplicationRunner {
    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================================" + holoman);
    }
}
