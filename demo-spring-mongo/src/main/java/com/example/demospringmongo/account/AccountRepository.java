package com.example.demospringmongo.account;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * AccountRepository.java
 * 사용자 리포지토리
 *
 * @author 이유나
 * @since 2023.04.25
 */
public interface AccountRepository extends MongoRepository<Account, String> {
    Optional<Account> findByEmail(String email);
}
