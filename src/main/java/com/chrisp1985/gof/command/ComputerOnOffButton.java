package com.chrisp1985.gof.command;

public class ComputerOnOffButton {

    private Command command;

    public ComputerOnOffButton setCommand(Command command) {
        this.command = command;
        return this;
    }

    public void pushButton() {
        command.execute();
    }
}
