package com.chrisp1985.gof.command;

public class ComputerOffCommand implements Command{

    Computer computer;

    public ComputerOffCommand() {
        this.computer = new Computer();
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}
