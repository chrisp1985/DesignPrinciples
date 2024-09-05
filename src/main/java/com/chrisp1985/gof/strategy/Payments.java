package com.chrisp1985.gof.strategy;

import java.util.Random;

public class Payments {

    PaymentTypeInterface payments;

    public Payments() {
        this.payments = new BankAccountPayments();
        System.out.println("Creating payment service using default of Bank Account.");
    }

    public void setPaymentMethod(PaymentTypeInterface payments) {
        this.payments = payments;
    }

    public void pay() {
        System.out.printf("Paying with: %s.\n", payments.getName());

        Double amountToReturn = new Random().nextDouble(200);
        this.payments.makePayment(amountToReturn);
    }
}
