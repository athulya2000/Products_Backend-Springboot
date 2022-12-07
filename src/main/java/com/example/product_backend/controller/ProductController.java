package com.example.product_backend.controller;

import com.example.product_backend.dao.ProductsDao;
import com.example.product_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductsDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addproduct",consumes = "application/json",produces = "application/json")
    public Map<String,String>  Productadd(@RequestBody Products p){
        System.out.println(p.getProductcode().toString());
        System.out.println(p.getProductname().toString());
        System.out.println(p.getManufacturingDate().toString());
        System.out.println(p.getExpirydate().toString());
        System.out.println(p.getBrand());
        System.out.println(p.getPrice().toString());
        System.out.println(p.getSellername().toString());
        System.out.println(p.getDistributorname().toString());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @PostMapping("/productsearch")
    public String Productsearch(){
        return "Welcome to product search page";
    }

    @PostMapping("/productedit")
    public String Productedit(){
        return "Welcome to product edit page";
    }
     @CrossOrigin(origins = "*")
    @GetMapping("/productviewall")
    public List<Products> Productviewall(){

        return (List<Products>) dao.findAll();
    }

    @PostMapping("/productdelete")
    public String Productdelete(){
        return "Welcome to product delete page";
    }
}
