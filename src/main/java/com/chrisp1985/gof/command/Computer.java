package com.chrisp1985.gof.command;

public class Computer {

    public static boolean computerOn = false;

    public void turnOn() {
        if(computerOn) {
            System.out.println("PC already on!");
        }
        else {
            System.out.println("PC turned on.");
            setComputerOn(true);
        }

    }

    public void turnOff() {
        if(!computerOn) {
            System.out.println("PC already off!");
        }
        else {
            System.out.println("PC turned off.");
            setComputerOn(false);
        }
    }

    private void setComputerOn(boolean powerOn) {
        computerOn = powerOn;
    }
}
