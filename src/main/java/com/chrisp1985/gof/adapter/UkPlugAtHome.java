package com.chrisp1985.gof.adapter;

public class UkPlugAtHome implements UkPlugSocket{
    @Override
    public void plugInThreePin() {
        System.out.println("Plugged 3 pin into the living room wall successfully, pal.");
    }

    public void changeFuse() {
        System.out.println("Changing fuse in plug head.");
    }
}
