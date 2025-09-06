package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

enum zzfxv implements Iterator {
    INSTANCE;

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        zzfun.zzm(false, "no calls to next() since the last call to remove()");
    }
}

