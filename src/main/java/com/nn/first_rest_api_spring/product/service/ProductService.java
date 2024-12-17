package com.nn.first_rest_api_spring.product.service;

import com.nn.first_rest_api_spring.product.api.request.ProductRequest;
import com.nn.first_rest_api_spring.product.api.response.ProductResponse;
import com.nn.first_rest_api_spring.product.domain.Product;
import com.nn.first_rest_api_spring.product.repository.ProductRepository;
import com.nn.first_rest_api_spring.product.support.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}