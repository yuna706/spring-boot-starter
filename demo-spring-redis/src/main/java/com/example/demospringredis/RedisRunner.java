package com.example.demospringredis;

import com.example.demospringredis.account.Account;
import com.example.demospringredis.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * RedisRunner.java
 * 애플리케이션 실행시 사용자 객체를 레디스에 등록하기 위한 애플리케이션 러너
 *
 * @author 이유나
 * @since 2023.04.25
 */

@Component
public class RedisRunner implements ApplicationRunner {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values = stringRedisTemplate.opsForValue();

        values.set("yuna", "yunalee");
        values.set("springboot", "2.3.12 release");
        values.set("hello", "world");

        Account account = new Account();
        account.setEmail("yuna706@google.com");
        account.setUsername("yuna");

        accountRepository.save(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        System.out.println(byId.get().getUsername());
        System.out.println(byId.get().getEmail());
    }
}
