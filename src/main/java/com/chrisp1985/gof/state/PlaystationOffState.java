package com.chrisp1985.gof.state;

public class PlaystationOffState extends PlaystationState {

    public PlaystationOffState(Playstation playstation) {
        super(playstation);
    }

    @Override
    public void clickControllerButton() {
        System.out.println("Turning Playstation on.");
        playstation.setState(new PlaystationOnState(playstation));
    }

    @Override
    public void moveThumbstick() {
        System.out.println("Moving thumbstick does nothing.");
    }

    @Override
    public void loadGame(String title) {
        System.out.printf("Loading %s does nothing. Is it broken?\n", title);
    }
}
