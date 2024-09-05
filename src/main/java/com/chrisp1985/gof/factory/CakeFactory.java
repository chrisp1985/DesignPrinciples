package com.chrisp1985.gof.factory;

public abstract class CakeFactory {
    public Cake orderCake() {
        Cake cake = createCake();
        cake.addIngredients();
        cake.mix();
        cake.bake();
        return cake;
    }

    public abstract Cake createCake();
}
