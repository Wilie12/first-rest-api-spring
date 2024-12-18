package com.nn.first_rest_api_spring.product.support;

import com.nn.first_rest_api_spring.product.api.request.*;
import com.nn.first_rest_api_spring.product.api.response.ProductResponse;
import com.nn.first_rest_api_spring.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}
