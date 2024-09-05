package com.chrisp1985.gof.singleton;

import java.util.Random;

public class DesignBookSingleton {

    private static DesignBookSingleton designBookSingleton;
    private int id;

    private DesignBookSingleton() {
        id = new Random().nextInt(1000);
    }

    public static synchronized DesignBookSingleton getDesignBookSingleton() {
        if(designBookSingleton == null) {
            designBookSingleton = new DesignBookSingleton();
        }
        return designBookSingleton;
    }

    public Integer getId() {
        return this.id;
    }
}
