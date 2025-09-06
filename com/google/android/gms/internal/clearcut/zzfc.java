package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

final class zzfc implements Iterator {
    private final zzfa zzpe;
    private Iterator zzpf;

    zzfc(zzfa zzfa0) {
        this.zzpe = zzfa0;
        super();
        this.zzpf = zzfa0.zzpb.iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.zzpf.hasNext();
    }

    @Override
    public final Object next() {
        return this.zzpf.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

