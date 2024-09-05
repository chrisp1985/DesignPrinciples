package com.chrisp1985.gof.strategy;

public class BankAccountPayments implements PaymentTypeInterface{
    @Override
    public void makePayment(Double amountPounds) {
        System.out.printf("Making payment from Bank Account the amount of £%.2f\n", amountPounds);
    }

    @Override
    public String getName() {
        return "Bank Account";
    }
}
