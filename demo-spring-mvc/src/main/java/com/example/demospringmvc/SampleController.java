package com.example.demospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * SampleController.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.19
 */
@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "yuna");
        return "hello";
    }
}
