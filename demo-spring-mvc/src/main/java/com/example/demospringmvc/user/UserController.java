package com.example.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

/**
 * UserController.java
 * 사용자 컨트롤러
 *
 * @author 이유나
 * @since 2023.04.19
 */
@RestController
public class UserController {
//
//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
