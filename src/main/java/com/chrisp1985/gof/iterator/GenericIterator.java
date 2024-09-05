package com.chrisp1985.gof.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericIterator<T> implements Iterator<T> {

    private T[] array;
    private int position = 0;

    public GenericIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[position++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
