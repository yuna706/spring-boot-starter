package com.example.demospringredis.account;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * Account.java
 *  사용자 레디스 등록 객체
 *
 * @author 이유나
 * @since 2023.04.25
 */
@RedisHash("accounts")
public class Account {
    @Id
    private String id;

    private String username;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
