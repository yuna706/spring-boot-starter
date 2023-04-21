package com.example.demospringdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

/**
 * PgSqlRunner.java
 * postgreSQL 커넥션을 위한 클래스
 *
 * @author 이유나
 * @since 2023.04.21
 */
@Component
public class PgSqlRunner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()){
            System.out.println(connection.getMetaData().getClass());
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE account(id integer NOT NULL, name varchar(255), PRIMARY KEY (id))";
            statement.executeUpdate(sql);
        }

        jdbcTemplate.execute("INSERT INTO account VALUES (1, 'yuna')");
    }
}
