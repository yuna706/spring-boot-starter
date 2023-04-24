package com.example.demospringjpa.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * AccountRepositoryTest.java
 * 사용자 리포지토리 테스트
 *
 * @author 이유나
 * @since 2023.04.21
 */
@RunWith(SpringRunner.class)
@DataJpaTest // 슬라이싱 테스트 == 임베디드 DB(h2) 사용
public class AccountRepositoryTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() throws SQLException {
        Account account = new Account();
        account.setUsername("yuna");
        account.setPassword("pass");

        Account newAccount = accountRepository.save(account);

        assertThat(newAccount).isNotNull();

        Optional<Account> byUsername = accountRepository.findByUsername(newAccount.getUsername());
        assertThat(byUsername).isNotEmpty();

        Optional<Account> yuna = accountRepository.findByUsername("유나");
        assertThat(yuna).isEmpty();
    }
}