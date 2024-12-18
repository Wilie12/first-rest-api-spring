package com.nn.first_rest_api_spring.product.repository;

import com.nn.first_rest_api_spring.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
