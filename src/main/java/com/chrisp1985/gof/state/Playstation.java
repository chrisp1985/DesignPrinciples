package com.chrisp1985.gof.state;

public class Playstation {

    PlaystationState state;

    public Playstation() {
        this.state = new PlaystationOnState(this);
        System.out.println("Unpackaged a new Playstation, and turned on straight away!");
    }

    public void setState(PlaystationState state) {
        this.state = state;
    }

    public void clickControllerButton() {
        this.state.clickControllerButton();
    }

    public void moveThumbstick() {
        this.state.moveThumbstick();
    }

    public void loadGame(String gameTitle) {
        this.state.loadGame(gameTitle);
    }
}
