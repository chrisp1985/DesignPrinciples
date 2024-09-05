package com.chrisp1985.solid.openclosed.decorators;

import com.chrisp1985.solid.openclosed.HardbackBookInterface;

public abstract class BookDecorator implements HardbackBookInterface {

    public HardbackBookInterface hardbackBookInterface;

    public BookDecorator(HardbackBookInterface hardbackBookInterface) {
        this.hardbackBookInterface = hardbackBookInterface;
    }

    public void readBook() {
        this.hardbackBookInterface.readBook();
    }

}
