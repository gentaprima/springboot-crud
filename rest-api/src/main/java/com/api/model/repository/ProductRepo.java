package com.api.model.repository;

import com.api.model.entity.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Long>{
    
}
