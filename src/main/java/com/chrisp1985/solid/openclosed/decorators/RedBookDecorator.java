package com.chrisp1985.solid.openclosed.decorators;

import com.chrisp1985.solid.openclosed.HardbackBookInterface;

public class RedBookDecorator extends BookDecorator {
    public RedBookDecorator(HardbackBookInterface hardbackBookInterface) {
        super(hardbackBookInterface);
    }

    @Override
    public void readBook() {
        hardbackBookInterface.readBook();
        setRedBook(hardbackBookInterface);
    }

    private void setRedBook(HardbackBookInterface hardbackBookInterface) {
        System.out.println("Book is red.");
    }
}
