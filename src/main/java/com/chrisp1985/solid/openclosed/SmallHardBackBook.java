package com.chrisp1985.solid.openclosed;

public class SmallHardBackBook implements HardbackBookInterface {

    /**
     * EXPLANATION
     *
     * The decorator wraps around the hardbackbookbase to add extra functionality on top of what the base already
     * does.
     *
     *
     */

    @Override
    public void readBook() {
        System.out.println("reading a tiny hardback book.");
    }
}
