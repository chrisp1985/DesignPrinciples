package com.chrisp1985.gof.bridge;

public class StandardBundle extends Playstation3 {
    public StandardBundle(Playstation3Variant playstation3Variant) {
        super(playstation3Variant);
        System.out.println("Standard....");
    }

    @Override
    public void playGame() {
        System.out.println("First guy to play Ridge Racer 7.");
    }

    @Override
    public void includeExtras() {
        System.out.println("Extra Joypads");
        System.out.println("Extra HDMI lead");
    }

    @Override
    public void getDetails() {
        System.out.printf("Hard Drive size: %d\nIs it Backwards Compatible?: %s",
                playstation3Variant.getHardDriveTypeSize(), playstation3Variant.isBackwardsCompatible());
    }
}
