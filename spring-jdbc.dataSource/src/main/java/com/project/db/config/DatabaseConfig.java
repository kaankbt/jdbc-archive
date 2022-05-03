package com.project.db.config;

import com.project.db.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public Database database() {

        Database database = new Database();

        database.setDriverClassName("H2");
        database.setUrl("jdbc:h2:tcp://localhost/3306/javaspringexamples");
        database.setUsername("sa");
        database.setPassword("");
        return database;
    }

    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("H2");
        dataSource.setUrl("jdbc:h2:tcp://localhost/3306/javaspringexamples");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;    }

}
