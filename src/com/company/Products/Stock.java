package com.company.Products;

import com.company.ProductPricingService;

public class Stock extends Product {

    private String ticker, exchange;
    private ProductPricingService productPricingService;


    //Constructor for Stock class
    public Stock(String productID, String exchange, String ticker, ProductPricingService productPricingService) {
        super(productID);
        this.exchange = exchange;
        this.ticker = ticker;
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.ticker);
    }

    //Generating getter functions
    public String getTicker() {
        return ticker;
    }

    public String getExchange() {
        return exchange;
    }

    public ProductPricingService getProductPricingService() {
        return productPricingService;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    //Generating setter functions
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setProductPricingService(ProductPricingService productPricingService) {
        this.productPricingService = productPricingService;
    }
}
