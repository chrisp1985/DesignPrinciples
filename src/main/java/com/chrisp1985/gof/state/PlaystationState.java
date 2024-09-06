package com.chrisp1985.gof.state;

public abstract class PlaystationState {

    public Playstation playstation;

    public PlaystationState(Playstation playstation) {
        this.playstation = playstation;
    }

    public abstract void clickControllerButton();
    public abstract void moveThumbstick();
    public abstract void loadGame(String title);
}
