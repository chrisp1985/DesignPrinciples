package com.chrisp1985.gof.state;

import lombok.Setter;

@Setter
public class Playstation {

    PlaystationState state;

    public Playstation() {
        this.state = new PlaystationOnState(this);
        System.out.println("Unpackaged a new Playstation, and turned on straight away!");
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
