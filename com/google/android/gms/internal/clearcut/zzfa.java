package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzfa extends AbstractList implements zzcx, RandomAccess {
    private final zzcx zzpb;

    public zzfa(zzcx zzcx0) {
        this.zzpb = zzcx0;
    }

    @Override
    public final Object get(int v) {
        return (String)this.zzpb.get(v);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcx
    public final Object getRaw(int v) {
        return this.zzpb.getRaw(v);
    }

    @Override
    public final Iterator iterator() {
        return new zzfc(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzfb(this, v);
    }

    @Override
    public final int size() {
        return this.zzpb.size();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcx
    public final List zzbt() {
        return this.zzpb.zzbt();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcx
    public final zzcx zzbu() {
        return this;
    }
}

