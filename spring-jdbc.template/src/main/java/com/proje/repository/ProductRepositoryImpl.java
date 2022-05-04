package com.proje.repository;

import com.proje.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ProductRepositoryImpl implements IProductRepository{

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    @Override
    public boolean save(Product product) {
        this.jdbcTemplate.setDataSource(dataSource);
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
