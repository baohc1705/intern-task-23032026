package com.baohc.ProductService.service;

import com.baohc.ProductService.entity.Product;
import com.baohc.ProductService.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        // In log debug
        productRepository.findAll()
                .forEach(t-> log.info(t.toString()));
        List<Product> result = productRepository.findAll();
        if (result.isEmpty())
            log.info("Tải danh sách Product rỗng");
        return result;
    }
}
