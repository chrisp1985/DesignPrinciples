package com.chrisp1985.solid.interfacesegregation;

public class SoftbackBook implements JustEnoughInterface {
    @Override
    public void readBook() {
        System.out.println("Reading softback book.");
    }
}
