package com.company.Products;

import com.company.ProductPricingService;

public class Option extends Product {

    private String exchange, ticker;
    int validForDays;
    private ProductPricingService productPricingService;

    //Constructor for Option class
    public Option(String productID, String exchange, int validForDays, ProductPricingService productPricingService) {
        super(productID);
        this.exchange = exchange;
        this.validForDays = validForDays;
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.ticker, this.validForDays);
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getValidForDays() {
        return validForDays;
    }

    public void setValidForDays(int validForDays) {
        this.validForDays = validForDays;
    }
}
