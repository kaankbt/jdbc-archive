package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class AppConfig {

    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("H2");
        dataSource.setUrl("jdbc:h2:tcp://localhost/3306/javaspringexamples");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;    }
}
