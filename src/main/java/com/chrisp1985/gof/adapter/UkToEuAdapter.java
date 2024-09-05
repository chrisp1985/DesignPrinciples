package com.chrisp1985.gof.adapter;

public class UkToEuAdapter implements EuPlugSocket{

    UkPlugSocket ukPlugSocket;

    public UkToEuAdapter(UkPlugSocket ukPlugSocket) {

        this.ukPlugSocket = ukPlugSocket;

    }

    @Override
    public void plugInTwoProng() {
        this.ukPlugSocket.plugInThreePin();
        System.out.println("Plugged into EU plug socket.");
    }
}
