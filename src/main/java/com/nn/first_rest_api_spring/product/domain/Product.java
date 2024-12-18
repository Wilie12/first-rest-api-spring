package com.nn.first_rest_api_spring.product.domain;

import jakarta.persistence.*;

@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Product() {}

    public Product(String name) { this.name = name; }

    public Long getId() { return id; }
    public String getName() { return name; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
