package com.company;

import com.company.Products.*;

import  java.util.*;

public class Services implements ParisTradedProducts {

//Holds registered products
private List<Product> registeredProducts = new ArrayList<>();

//Holds registered products with quantity
private Map<Product, Integer> tradedProducts = new HashMap<>();


    //Add new products to list
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if (productIsRegistered(product)) throw new ProductAlreadyRegisteredException("Product is already registered.");
        this.registeredProducts.add(product);
    }

    //Check if product is already registered
    private boolean productIsRegistered(Product product) {
        boolean productIsAlreadyRegistered = false;
        for (Product p : registeredProducts){
            if (registeredProducts.contains(product.getProductID())) productIsAlreadyRegistered = true;
            break;
        }

        return productIsAlreadyRegistered;
    }

    //Books a quantity against the product traded
    @Override
    public void trade(Product product, int quantity) {
        if (productIsRegistered(product)){
            tradedProducts.put(product, quantity);
        }
    }


    //Calculates the total quantity of all the registered traded products so far today
    @Override
    public int totalTradeQuantityForDay() {
        int totalTradeQuantity = 0;
        for (Integer i : tradedProducts.values()) totalTradeQuantity +=1;
        return totalTradeQuantity;
    }

    //return the total value of today's traded products
    @Override
    public double totalValueOfDaysTradedProducts() {
        double totalValue = 0;
        for (Map.Entry<Product, Integer> entry : this.tradedProducts.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();

            totalValue += product.getPrice() * quantity;
        }
        return totalValue;
    }

}
