package com.chrisp1985.gof.factory;

public class VictoriaSpongeCake implements Cake{
    @Override
    public void bake() {
        System.out.println("Baking my Victoria Sponge at 180.");
    }

    @Override
    public void addIngredients() {
        System.out.println("Creating a generic cake batter.");
    }

    @Override
    public void mix() {
        System.out.println("Mix as normal.");
    }
}
