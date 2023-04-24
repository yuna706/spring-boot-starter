package com.example.demospringjpa.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * AccountRepository.java
 * 사용자 리포지토리
 *
 * @author 이유나
 * @since 2023.04.21
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
