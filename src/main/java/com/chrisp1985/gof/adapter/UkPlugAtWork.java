package com.chrisp1985.gof.adapter;

public class UkPlugAtWork implements UkPlugSocket{
    @Override
    public void plugInThreePin() {
        System.out.println("Plugged 3 pin into the work mains successfully, pal.");
    }

    public void requestFuseChange() {
        System.out.println("Raised ticket with IT for a new plug.");
    }
}
