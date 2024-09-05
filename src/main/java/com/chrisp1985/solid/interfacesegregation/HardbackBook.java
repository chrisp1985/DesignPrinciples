package com.chrisp1985.solid.interfacesegregation;

public class HardbackBook implements JustEnoughInterface, HardbackSpecificInterface {

    /**
     * EXPLANATION
     *
     * We implement from 2 interfaces to get both methods rather than forcing the Softback Book to have to throw a not
     * implemented exception for the implemented method it doesn't need to use.
     *
     */


    @Override
    public void readBook() {
        System.out.println("Reading Hardback book.");
    }

    @Override
    public void removeSleeve() {
        System.out.println("Removing sleeve of hadrback book.");
    }
}
