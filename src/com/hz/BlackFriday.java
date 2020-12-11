package com.hz;

import products.Product;

public class BlackFriday implements DiscountStrategy {

    @Override
    public double getDiscount(Product product, int index, Customer customer) {
      return 0.50;
//
    }

}
