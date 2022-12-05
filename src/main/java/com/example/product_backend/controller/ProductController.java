package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/")
    public String Productadd(){
        return "Welcome to product add page";
    }

    @PostMapping("/productsearch")
    public String Productsearch(){
        return "Welcome to product search page";
    }

    @PostMapping("/productedit")
    public String Productedit(){
        return "Welcome to product edit page";
    }

    @GetMapping("/productviewall")
    public String Productviewall(){
        return "Welcome to product view all page";
    }
}
