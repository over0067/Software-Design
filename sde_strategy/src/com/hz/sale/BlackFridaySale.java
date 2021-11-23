package com.hz.sale;

import com.hz.Customer;

public class BlackFridaySale implements Sale {

    @Override
    public float calcDiscount(Customer costumer) {
        int cartSize = costumer.getCart().size();
        double discount;

        if (cartSize < 8) {
            discount = cartSize * .10;
        } else {
            discount = .80;
        }
        return 1 - (float)discount;
    }
}
