package com.chrisp1985.gof.factory;

public class ChocolateCakeFactory extends CakeFactory{
    @Override
    public Cake createCake() {
        System.out.println("Creating a chocolate cake");
        return new ChocolateCake();
    }
}
