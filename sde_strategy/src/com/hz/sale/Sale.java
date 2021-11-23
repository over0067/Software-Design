package com.hz.sale;

import com.hz.Customer;
import products.Product;

public interface Sale {
    public float calcDiscount(Customer customer);
}
