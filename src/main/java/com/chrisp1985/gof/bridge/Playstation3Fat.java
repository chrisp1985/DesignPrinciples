package com.chrisp1985.gof.bridge;

public class Playstation3Fat implements Playstation3Variant{
    @Override
    public boolean isBackwardsCompatible() {
        return true;
    }

    @Override
    public Integer getHardDriveTypeSize() {
        return 60;
    }
}
