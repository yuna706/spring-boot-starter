package com.example.demospringmvc.user;

/**
 * User.java
 * 사용자 MODEL
 *
 * @author 이유나
 * @since 2023.04.19
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
