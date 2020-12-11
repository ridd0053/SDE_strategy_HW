package com.hz;

import products.Product;

public class Regular implements DiscountStrategy {

    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        if(customer.isRegular()) {
            return  .15;
        }else{
            return .00;
        }
    }

}

