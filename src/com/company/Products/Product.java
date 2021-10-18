package com.company.Products;

public class Product<product> {

    private String productID, exchange;
    private double price;

    public Product(String productID) {
        this.productID = productID;
    }

    //Set product ID
    public void setProductID(String productID) {
        this.productID = productID;
    }

    //Get product ID
    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return 0.0;
    }
}
