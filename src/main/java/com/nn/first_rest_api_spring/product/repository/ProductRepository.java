package com.nn.first_rest_api_spring.product.repository;

import com.nn.first_rest_api_spring.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    protected final Map<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity) {
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        entity.setId(counter);
        map.put(counter, entity);
        counter++;
        return entity;
    }
}
