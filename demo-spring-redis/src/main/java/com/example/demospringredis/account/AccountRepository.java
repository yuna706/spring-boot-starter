package com.example.demospringredis.account;

import org.springframework.data.repository.CrudRepository;

/**
 * AccountRepository.java
 * 사용자 리포지토리
 *
 * @author 이유나
 * @since 2023.04.25
 */
public interface AccountRepository extends CrudRepository<Account, String> {
}
