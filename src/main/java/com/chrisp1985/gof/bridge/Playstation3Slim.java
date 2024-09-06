package com.chrisp1985.gof.bridge;

public class Playstation3Slim implements Playstation3Variant{
    @Override
    public boolean isBackwardsCompatible() {
        return false;
    }

    @Override
    public Integer getHardDriveTypeSize() {
        return 160;
    }
}
