package com.baohc.ProductService.service;

import com.baohc.ProductService.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product save(Product product);

    void deleteById(int id);

    Product findById(int id);
}
