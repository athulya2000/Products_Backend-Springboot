package com.example.product_backend.dao;

import com.example.product_backend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Products,Integer> {
}
