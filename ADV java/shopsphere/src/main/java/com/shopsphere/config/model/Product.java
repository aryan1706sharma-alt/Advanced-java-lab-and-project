package com.shopsphere.model;

import java.io.Serializable;

// Serializable interface ka use isliye kiya hai taaki is object ko Networking/RMI module me transfer kiya ja sake
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int productId;
    private int categoryId;
    private String name;
    private String brand;
    private double price;
    private int stock;

    // Default Constructor
    public Product() {}

    // Parameterized Constructor
    public Product(int productId, int categoryId, String name, String brand, double price, int stock) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
