package com.chrisp1985.gof.state;

public class PlaystationOnState extends PlaystationState {

    public PlaystationOnState(Playstation playstation) {
        super(playstation);
    }

    @Override
    public void clickControllerButton() {
        System.out.println("Turning Playstation off.");
        playstation.setState(new PlaystationOffState(playstation));
    }

    @Override
    public void moveThumbstick() {
        System.out.println("Moving thumbstick around.");
    }

    @Override
    public void loadGame(String title) {
        System.out.printf("%s! Great game.\n", title);
    }
}
