package com.chrisp1985.gof.factory;

public class VictoriaSpongeCakeFactory extends CakeFactory{
    @Override
    public Cake createCake() {
        System.out.println("Creating a Victoria Sponge cake");
        return new VictoriaSpongeCake();
    }
}
