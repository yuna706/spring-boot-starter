package com.example.springbootsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeContoller.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.05.03
 */
@Controller
public class HomeContoller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/my")
    public String my() {
        return "my";
    }
}
