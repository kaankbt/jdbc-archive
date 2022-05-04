package com.proje.repository;

import com.proje.model.Product;

public interface IProductRepository {

    boolean save(Product product);

    boolean update(Product product);
}
