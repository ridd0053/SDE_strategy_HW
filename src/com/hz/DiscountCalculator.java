package com.hz;

import products.Product;

public class DiscountCalculator {

    private Customer customer;
    private DiscountStrategy strategy;
    // set strategy
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }



    public DiscountCalculator(Customer customer) {

        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {

        double discount = this.strategy.getDiscount(product, index, this.customer);





        // on Christmas Eve, 1st product 20%, the next 12.5% discount

//        if(isChristmasEve) {
//

//        }

        // Default situation: new customers full price, regular 15% off
//        else if(customer.isRegular()) {
//            discount = .15;
//        }

        return 1 - discount;
    }
}
