package com.chrisp1985.gof.factory;

public class ChocolateCake implements Cake{
    @Override
    public void bake() {
        System.out.println("Baking my Chocolate Cake at 160.");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding my cocoa power to the generic cake batter.");
    }

    @Override
    public void mix() {
        System.out.println("Mix as normal, then add some choc chips.");
    }
}
