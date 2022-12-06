package com.example.product_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue
    private int id;
    private String productcode;
    private String productname;
    private String manufacturingDate;
    private String expirydate;
    private String brand;
    private String price;
    private String sellername;
    private String distributorname;

    public Products() {
    }

    public Products(int id, String productcode, String productname, String manufacturingDate, String expirydate, String brand, String price, String sellername, String distributorname) {
        this.id = id;
        this.productcode = productcode;
        this.productname = productname;
        this.manufacturingDate = manufacturingDate;
        this.expirydate = expirydate;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.distributorname = distributorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getDistributorname() {
        return distributorname;
    }

    public void setDistributorname(String distributorname) {
        this.distributorname = distributorname;
    }
}
