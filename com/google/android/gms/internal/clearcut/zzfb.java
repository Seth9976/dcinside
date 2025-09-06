package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

final class zzfb implements ListIterator {
    private ListIterator zzpc;
    private final int zzpd;
    private final zzfa zzpe;

    zzfb(zzfa zzfa0, int v) {
        this.zzpe = zzfa0;
        this.zzpd = v;
        super();
        this.zzpc = zzfa0.zzpb.listIterator(v);
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.zzpc.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.zzpc.hasPrevious();
    }

    @Override
    public final Object next() {
        return (String)this.zzpc.next();
    }

    @Override
    public final int nextIndex() {
        return this.zzpc.nextIndex();
    }

    @Override
    public final Object previous() {
        return (String)this.zzpc.previous();
    }

    @Override
    public final int previousIndex() {
        return this.zzpc.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

