package com.example.demospringmongo;

import com.example.demospringmongo.account.Account;
import com.example.demospringmongo.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class DemoSpringMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMongoApplication.class, args);
    }

    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
    AccountRepository accountRepository;

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            Account account = new Account();
            account.setEmail("yuna706@gmailcom");
            account.setUsername("yuna");
            
//            mongoTemplate.insert(account);
            accountRepository.insert(account);
            System.out.println("끝");
        };
    }
}
