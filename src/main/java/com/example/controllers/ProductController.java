package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.Products;

@RestController
public class ProductController {

    @Autowired
    private Products products;
    
    @RequestMapping("/products")
    public String getProducts(){
        return products.getProducts();
    }
}
