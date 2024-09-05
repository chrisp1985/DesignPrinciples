package com.chrisp1985.gof.strategy;

import java.util.Random;

public class PaypalPayments implements PaymentTypeInterface{

    public String emailAddress;

    public PaypalPayments(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.printf("Paypal account in use: %s\n", emailAddress);
    }

    @Override
    public void makePayment(Double amountPounds) {
        System.out.printf("Paying via Paypal the amount of £%.2f\n", amountPounds);
    }

    @Override
    public String getName() {
        return "Paypal";
    }

    private void getFundsFromAccount() {
        Double amountToReturn = new Random().nextDouble(200, 10000);
        System.out.printf("Getting funds from %s, and found £%.2f.", this.emailAddress, amountToReturn);
    }
}
