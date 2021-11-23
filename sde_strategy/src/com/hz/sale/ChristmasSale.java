package com.hz.sale;

import com.hz.Customer;

public class ChristmasSale implements Sale {

    private final int index;

    public ChristmasSale(int index) {
        this.index = index;
    }

    @Override
    public float calcDiscount(Customer customer) {
        float discount = this.index == 0 ?.2f : .125f;

        return 1 - discount;
    }
}
