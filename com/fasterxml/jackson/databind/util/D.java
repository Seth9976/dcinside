package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class d implements Iterable, Iterator {
    private final Object[] a;
    private int b;

    public d(Object[] arr_object) {
        this.a = arr_object;
        this.b = 0;
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        int v = this.b;
        Object[] arr_object = this.a;
        if(v >= arr_object.length) {
            throw new NoSuchElementException();
        }
        this.b = v + 1;
        return arr_object[v];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

