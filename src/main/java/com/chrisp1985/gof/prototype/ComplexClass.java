package com.chrisp1985.gof.prototype;

import java.util.Random;

public class ComplexClass implements Cloneable{

    int id;

    String updateString;

    public ComplexClass() {
        this.id = new Random().nextInt(50000);
    }

    @Override
    public ComplexClass clone() {
        try {
            return (ComplexClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getUpdateString() {
        return this.updateString;
    }

    public void setUpdateString(String updateString) {
        this.updateString = updateString;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
