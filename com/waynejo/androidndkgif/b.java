package com.waynejo.androidndkgif;

import java.util.Iterator;

public abstract class b implements Iterator {
    public abstract void a();

    public abstract GifImage b();

    @Override
    public abstract boolean hasNext();

    @Override
    public Object next() {
        return this.b();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

