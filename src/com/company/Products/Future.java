package com.company.Products;

import com.company.ProductPricingService;

public class Future extends Product {

    private String exchange, contractCode;
    private int month, year;
    private ProductPricingService productPricingService;

    //Constructor for Future class
    public Future(String productID, String exchange, String contractCode, int month, ProductPricingService productPricingService) {
        super(productID);
        this.exchange = exchange;
        this.month = month;
        this.contractCode = contractCode;
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.contractCode, this.month, this.year);
    }

    //Generating getter functions
    public String getExchange() {
        return exchange;
    }

    public String getContractCode() {
        return contractCode;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public ProductPricingService getProductPricingService() {
        return productPricingService;
    }


//Generating setter functions

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProductPricingService(ProductPricingService productPricingService) {
        this.productPricingService = productPricingService;
    }
}
