package com.chrisp1985.gof.command;

public class ComputerOnCommand implements Command{

    Computer computer;

    public ComputerOnCommand() {
        this.computer = new Computer();
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
