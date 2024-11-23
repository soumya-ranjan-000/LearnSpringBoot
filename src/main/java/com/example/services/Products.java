package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.data.Product;
import com.google.gson.Gson;

@Service
public class Products {
    Gson gson = new Gson();

    private List<Product> listOfProducts = new ArrayList<>(List.of(
            new Product("iphone14", 111234.56, 120),
            new Product("realme ipad 2", 17899.00, 30),
            new Product("Noise Smart Watch", 1340.0, 50)));

    public String getProducts() {
        return gson.toJson(listOfProducts);
    }

}
