package com.repository;

import com.model.Product;

public interface IProductRepository {

    boolean save(Product product);

    boolean update(Product product);
}
