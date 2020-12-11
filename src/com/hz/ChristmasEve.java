package com.hz;

import products.Product;

public class ChristmasEve implements DiscountStrategy {

    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        boolean isFirstProduct = index == 0;
        if(isFirstProduct) {
         return .20;
            } else {
          return .125;
            }
//
    }

}
