package com.chrisp1985.gof.adapter;

public class EuPlugInHotel implements EuPlugSocket{
    @Override
    public void plugInTwoProng() {
        System.out.println("Plugged into Hotel wall.");
    }

    public void requestNewPlug() {
        System.out.println("Hotel confirms they will only replace plugs supplied by the hotel.");
    }
}
