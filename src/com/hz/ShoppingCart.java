package com.hz;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {
    DiscountCalculator discountCalculator;

    public double getTotalPrice(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
        double totalPrice = 0.0;

        for(Product product : this) {

            int index = this.indexOf(product);

            double discount = discountCalculator.getDiscount(product, index);
            double price = product.getPrice();

            totalPrice += price *= discount;
        }

        return totalPrice;
    }
}