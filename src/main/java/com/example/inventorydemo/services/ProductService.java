package com.example.inventorydemo.services;


import com.example.inventorydemo.entities.Products;
import com.example.inventorydemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Products> getProducts()
    {
        List<Products>prod= productRepository.findAll();
        return prod;
    }

}
