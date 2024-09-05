package com.chrisp1985.gof.strategy;

public interface PaymentTypeInterface {

    void makePayment(Double amountPounds);
    String getName();
}
