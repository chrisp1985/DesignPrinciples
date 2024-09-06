package com.chrisp1985.gof.bridge;

public class LuxuryBundle extends Playstation3 {
    public LuxuryBundle(Playstation3Variant playstation3Variant) {
        super(playstation3Variant);
        System.out.println("LUXURY BABY.");
    }

    @Override
    public void playGame() {
        System.out.println("First guy to play Ridge Racer 7.");
        System.out.println("First guy to play MotorStorm.");
        System.out.println("First guy to play Virtua Fighter 5.");
    }

    @Override
    public void includeExtras() {
        System.out.println("Extra Joypads");
        System.out.println("Extra HDMI lead");
        System.out.println("Extra Web Cam");
        System.out.println("Extra Motion Controller stick.");
    }

    @Override
    public void getDetails() {
        System.out.printf("Hard Drive size: %d\nIs it Backwards Compatible?: %s\n",
                playstation3Variant.getHardDriveTypeSize(), playstation3Variant.isBackwardsCompatible());
    }
}
