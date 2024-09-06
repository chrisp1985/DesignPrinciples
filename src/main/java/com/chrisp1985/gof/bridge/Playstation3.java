package com.chrisp1985.gof.bridge;

public abstract class Playstation3 {

    protected Playstation3Variant playstation3Variant;

    public Playstation3(Playstation3Variant playstation3Variant) {
        this.playstation3Variant = playstation3Variant;
    }

    abstract void playGame();
    abstract void includeExtras();
    abstract void getDetails();
}
