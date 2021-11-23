package com.hz;

import com.hz.sale.BlackFridaySale;
import com.hz.sale.ChristmasSale;
import com.hz.sale.NoSale;
import com.hz.sale.Sale;
import products.Product;

public class DiscountCalculator {

    private Customer customer;
    private Sale strategy;

//    public void setChristmasEve(boolean christmasEve) {
//        isChristmasEve = christmasEve;
//    }
//    //toegevoegd
//    public void setBlackFriday(boolean BlackFriday) {
//        isBlackFriday = BlackFriday;
//    }

//    private boolean isChristmasEve;
//    //toegevoegd
//    private boolean isBlackFriday;
    private int index;

    public DiscountCalculator(Customer customer, int index) {
        this.customer = customer;
        this.index = index;
    }

    public double getDiscount(Product product, int index) {
            return strategy.calcDiscount();
    }

    public void setStrategy(SalesAction salesAction) {
        switch (salesAction) {
            case NoAction:
                this.strategy = new NoSale(customer);
                break;
            case BlackFriday:
                this.strategy = new BlackFridaySale();
                break;
            case ChristmasEve:
                this.strategy = new ChristmasSale(index);
                break;
        }
    }
}
