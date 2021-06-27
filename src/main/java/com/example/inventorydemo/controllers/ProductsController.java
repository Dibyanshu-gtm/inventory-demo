package com.example.inventorydemo.controllers;

import com.example.inventorydemo.entities.Products;
import com.example.inventorydemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {
@Autowired
private ProductService productService;

    @GetMapping
    public String product(Model model)
    {
        List<Products> prod = productService.getProducts();
        model.addAttribute("products",prod);
        return "home";
    }

}
