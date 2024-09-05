package com.chrisp1985.solid.openclosed.decorators;

import com.chrisp1985.solid.openclosed.HardbackBookInterface;

public class OldBookDecorator extends BookDecorator {
    public OldBookDecorator(HardbackBookInterface hardbackBookInterface) {
        super(hardbackBookInterface);
    }

    @Override
    public void readBook() {
        hardbackBookInterface.readBook();
        setOldBook(hardbackBookInterface);
    }

    private void setOldBook(HardbackBookInterface hardbackBookInterface) {
        System.out.println("Book is old.");
    }
}
