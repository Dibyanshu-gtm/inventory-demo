package com.example.inventorydemo.repositories;

import com.example.inventorydemo.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products,Integer> {

    List<Products> findAll();
}
