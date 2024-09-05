package com.chrisp1985.solid.openclosed.decorators;

import com.chrisp1985.solid.openclosed.HardbackBookInterface;

public class BlueBookDecorator extends BookDecorator {
    public BlueBookDecorator(HardbackBookInterface hardbackBookInterface) {
        super(hardbackBookInterface);
    }

    @Override
    public void readBook() {
        hardbackBookInterface.readBook();
        setBlueBook(hardbackBookInterface);
    }

    private void setBlueBook(HardbackBookInterface hardbackBookInterface) {
        System.out.println("Book is blue.");
    }
}
